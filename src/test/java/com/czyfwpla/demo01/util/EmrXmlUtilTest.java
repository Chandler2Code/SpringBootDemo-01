package com.czyfwpla.demo01.util;

import com.czyfwpla.demo01.model.Drug;
import com.czyfwpla.demo01.model.Emr;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @Auther: Chandler
 * @Date: 2018/5/21 22:11
 * @Description:
 */

@SpringBootTest
@RunWith(SpringRunner.class)
public class EmrXmlUtilTest {

    @Test
    public void createEmr(){

        Emr emr = new Emr();
        emr.setSecTion("儿科门诊");
        emr.setTime("2016-01-21 08:07");
        emr.setName("李思思");
        emr.setSex("女");
        emr.setAge("25");
        emr.setPhone("18382469064");
        emr.setIdCard("510522*****");
        emr.setUnit("四川省成都市**");
        emr.setZhushu("***");
        emr.setSizhen("上呼吸道感染");
        emr.setLczd("上呼吸道感染");
        emr.setZxing("风热证");
        emr.setYwgms("/");
        emr.setZhifa("**");
        emr.setBingW("XXXX");
        emr.setBxing("xxxx");
        List<Drug>drugs = new ArrayList<>();
        Drug drug1 = new Drug("蒲公英","7g");
        Drug drug2 =new Drug("附子","12g");
        drugs.add(drug1);
        drugs.add(drug2);
        EmrXmlUtil.createXml(emr);
    }

}