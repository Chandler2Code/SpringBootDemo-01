package com.czyfwpla.demo01.util;

import com.czyfwpla.demo01.model.Drug;
import com.czyfwpla.demo01.model.Emr;
import org.dom4j.*;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

/**
 * @Auther: Chandler
 * @Date: 2018/5/21 22:05
 * @Description:
 */
public class EmrXmlUtil {

    /**
     * Description: 创建病例单
     */
    public static Document createXml(Emr emr){


        //1.创建document对象
        Document document = DocumentHelper.createDocument();

        //2.创建根节点
        Element EmrOrder = document.addElement("EmrOrder");
        EmrOrder.addAttribute("version","2.0");
        try {
            //4.创建子节点
            Field[] fields = emr.getClass().getDeclaredFields();

            for (int j = 0; j < fields.length; j++) {
                String type = fields[j].getGenericType().toString();
                String className = fields[j].getName();
                if (type.equals("class java.lang.String")){
                    Method m = emr.getClass().getMethod("get" + className);
                    Element emrChild = EmrOrder.addElement(className);
                    String value =(String) m.invoke(emr);
                    emrChild.setText(value);
                }else {
                    //4.创建子节点的下一子节点
                    List<Drug>drugs = emr.getDrugs();
                    Element emrChild = EmrOrder.addElement(className);
                    for (Drug drug:drugs){
                        Element emrGrandSon = emrChild.addElement("drug");
                        Element son2GrandSonName = emrGrandSon.addElement("name");
                        Element son2GrandSonDose = emrGrandSon.addElement("dose");
                        son2GrandSonName.addText(drug.getName());
                        son2GrandSonDose.addText(drug.getDose());
                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        //5.输入xml文件
        OutputFormat format = OutputFormat.createPrettyPrint();
        format.setEncoding("GBK");
        try{
            XMLWriter xmlWriter = new XMLWriter(new FileOutputStream("E:/emr.xml"),format);
            xmlWriter.write(document);
            xmlWriter.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return document;
    }
    /**
     * Description:  写入病例单
     */
    public static void writeEmr(){
        SAXReader saxReader = new SAXReader();
        try{
            //获取document对象
            Document document = saxReader.read(new File("E:/emr.xml"));
            //获取根节点
            Element EmrOrder = document.getRootElement();
            Iterator it= EmrOrder.elementIterator();
            //遍历迭代器
            while(it.hasNext()){
                //获取子节点的迭代器
               Element EmrContent = (Element) it.next();
               Iterator itt = EmrContent.elementIterator();
               if (EmrContent.getName() == "drugs"){
                   while (itt.hasNext()){
                       Element EmrContentChild = (Element) itt.next();
                       Iterator ittt = EmrContentChild.elementIterator();
                       System.out.println("节点名"+EmrContentChild.getName());
                       while (ittt.hasNext()){
                           Element EmrContentGrangSon = (Element) ittt.next();
                           System.out.println("节点名"+EmrContentGrangSon.getName()+"节点值"+EmrContentGrangSon.getStringValue());
                       }
                   }
               }
              else{
                   System.out.println("节点名"+EmrContent.getName()+"节点值"+EmrContent.getStringValue());
               }

            }
        }catch (DocumentException e){
            e.printStackTrace();
        }
    }
}