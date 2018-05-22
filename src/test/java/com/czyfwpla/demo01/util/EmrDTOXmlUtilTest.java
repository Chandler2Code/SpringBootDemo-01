package com.czyfwpla.demo01.util;

import com.czyfwpla.demo01.DTO.DrugDTO;
import com.czyfwpla.demo01.DTO.EmrDTO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: Chandler
 * @Date: 2018/5/21 22:11
 * @Description:
 */

@SpringBootTest
@RunWith(SpringRunner.class)
public class EmrDTOXmlUtilTest {

    @Test
    public void createEmr(){
        EmrDTO emrDTO = new EmrDTO();
        emrDTO.setSecTion("儿科门诊");
        emrDTO.setTime("2016-01-21 08:07");
        emrDTO.setName("李思思");
        emrDTO.setSex("女");
        emrDTO.setAge("25");
        emrDTO.setPhone("18382469064");
        emrDTO.setIdCard("510522*****");
        emrDTO.setUnit("四川省成都市**");
        emrDTO.setZhushu("***");
        emrDTO.setSizhen("上呼吸道感染");
        emrDTO.setLczd("上呼吸道感染");
        emrDTO.setZxing("风热证");
        emrDTO.setYwgms("/");
        emrDTO.setZhifa("**");
        emrDTO.setBingW("XXXX");
        emrDTO.setBxing("xxxx");
        List<DrugDTO> drugDTOS = new ArrayList<>();
        DrugDTO drugDTO1 = new DrugDTO("蒲公英","7g");
        DrugDTO drugDTO2 =new DrugDTO("附子","12g");
        drugDTOS.add(drugDTO1);
        drugDTOS.add(drugDTO2);
        emrDTO.setDrugDTOS(drugDTOS);
        EmrXmlUtil.createXml(emrDTO);
    }

    @Test
    public void writeEmr(){
        //传入xml所在的路径
        String path = "E:/emr.xml";
        EmrXmlUtil.writeEmr(path);
    }

}