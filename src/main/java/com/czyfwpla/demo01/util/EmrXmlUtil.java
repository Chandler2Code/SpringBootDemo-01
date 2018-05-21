package com.czyfwpla.demo01.util;

import com.czyfwpla.demo01.model.Drug;
import com.czyfwpla.demo01.model.Emr;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

import java.io.FileOutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Auther: Chandler
 * @Date: 2018/5/21 22:05
 * @Description:
 */
public class EmrXmlUtil {

    public static Document createXml(Emr emr){


        //1.创建document对象
        Document document = DocumentHelper.createDocument();

        //2.创建根节点
        Element EmrOrder = document.addElement("EmrOrder");
        EmrOrder.addAttribute("version","2.0");
        try {
            //3.创建子节点
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
                    Element emrChild = EmrOrder.addElement(className);
                    Element emrGrangson = emrChild.addElement("drug");
                    emrGrangson.setText("附子 5g");

                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }


        //3.输入xml文件
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
}