package com.czyfwpla.demo01.util;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

import java.io.FileOutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/**
 * @Auther: Chandler
 * @Date: 2018/5/21 17:08
 * @Description:  xml处理
 */
public class XmlUtil {


    /**
     * xml文档Document转对象
     * @param document
     * @param clazz
     * @return
     */
    public static Object getObjectByXmlDocument(Document document,Class<?>clazz){

        Object obj =null;
        Element root = document.getRootElement();
        try{
            obj = clazz.newInstance();
            List<Element> properties=root.elements();
            for(Element pro:properties){
         //获取属性名(首字母大写)
                String propertyname=pro.getName();
                String propertyvalue=pro.getText();
                Method m = obj.getClass().getMethod("set"+propertyname,String.class);
                m.invoke(obj,propertyvalue);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return obj;
    }
    /**
     * xml字符串转对象
     * @param xmlString
     * @param clazz
     * @return
     */
    public static Object getObjectByXmlString(String xmlString,Class<?> clazz) {
        Document document=null;
        try {
            document = DocumentHelper.parseText(xmlString);
        } catch (DocumentException e) {
            //TODO  修改
            e.printStackTrace();
        }      //获取根节点
        return getObjectByXmlDocument(document,clazz);
    }
    /**
     * 对象转xml文件
     * @param b
     * @return
     */
    public static Document getXmlDocumentByObject(Object b) {
        Document document = DocumentHelper.createDocument();
        try {
            // 创建根节点元素
            Element root = document.addElement(b.getClass().getSimpleName());
            Field[] field = b.getClass().getDeclaredFields(); // 获取实体类b的所有属性，返回Field数组
            for (int j = 0; j < field.length; j++) { // 遍历所有有属性
                String name = field[j].getName(); // 获取属属性的名字
                if (!name.equals("serialVersionUID")) {//去除串行化序列属性
                    name = name.substring(0, 1).toUpperCase()+ name.substring(1); // 将属性的首字符大写，方便构造get，set方法
                    Method m = b.getClass().getMethod("get" + name);
                    // System.out.println("属性get方法返回值类型:" + m.getReturnType());
                    String propertievalue = (String) m.invoke(b);// 获取属性值
                    Element propertie = root.addElement(name);
                    propertie.setText(propertievalue);
                }
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        OutputFormat format = new OutputFormat("",true);
        format.setEncoding("GBK");
        try{
            XMLWriter xmlWriter = new XMLWriter(new FileOutputStream("E:/"+b.getClass().getSimpleName()+".xml"),format);
            xmlWriter.write(document);
            xmlWriter.close();
        }catch (Exception e){
            e.printStackTrace();
        }

        return document;
    }
    /**
     * 对象转xml格式的字符串
     * @param b
     * @return
     */
    public static String getXmlStringByObject(Object b){
        return getXmlDocumentByObject(b).asXML();
    }
}