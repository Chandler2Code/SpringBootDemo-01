package com.czyfwpla.demo01.util;

import com.czyfwpla.demo01.model.Hero;
import com.czyfwpla.demo01.model.XmlCustomer;
import com.czyfwpla.demo01.model.XmlUser;
import org.dom4j.Document;
import org.dom4j.io.SAXReader;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.h2.H2ConsoleAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: Chandler
 * @Date: 2018/5/21 17:32
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class XmlUtilTest {

    @Test
    public void getObjectByXmlDocument() {

        SAXReader reader = new SAXReader();
        try {
            Document document = reader.read(new File("E:/XmlUser.xml"));
            XmlUser xmlUser = (XmlUser)XmlUtil.getObjectByXmlDocument(document,XmlUser.class);
            System.out.println(XmlUtil.getObjectByXmlDocument(document,XmlUser.class));
        }catch ( Exception e){
            e.printStackTrace();
        }
    }

    @Test
    public void getObjectByXmlString() {
    }

    @Test
    public void getXmlDocumentByObject() {


    }
    @Test
    public void getXmlStringByObject() {

        XmlUser xmlUser = new XmlUser();
        xmlUser.setName("李白");
        xmlUser.setAge("25");
        xmlUser.setAddress("北京");
        XmlUtil.getXmlStringByObject(xmlUser);

//        System.out.println(XmlUtil.getXmlStringByObject(xmlUser));
     /*   System.out.println(XmlUtil.getXmlDocumentByObject(xmlUser));*/
    }
}