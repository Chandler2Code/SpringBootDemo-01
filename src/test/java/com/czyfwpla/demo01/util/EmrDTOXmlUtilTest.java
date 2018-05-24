package com.czyfwpla.demo01.util;

import com.czyfwpla.demo01.DTO.DrugDTO;
import com.czyfwpla.demo01.DTO.EmrDTO;
import com.czyfwpla.demo01.convertAndWrite.convert;
import com.czyfwpla.demo01.mapper.EmrMapper;
import com.czyfwpla.demo01.mapper.RecipelDetailMapper;
import com.czyfwpla.demo01.mapper.RecipelMapper;
import com.czyfwpla.demo01.model.Emr;
import com.czyfwpla.demo01.model.Recipel;
import com.czyfwpla.demo01.model.RecipelDetail;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private EmrMapper emrMapper;
    @Autowired
    private RecipelMapper recipelMapper;
    @Autowired
    private RecipelDetailMapper recipelDetailMapper;

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
        EmrDTO emrDTO = EmrXmlUtil.writeEmr(path);
        //1.写入emr
        Emr emr = convert.emrDTO2Emr(emrDTO);
        emrMapper.addEmr(emr);
        //2.写入处方
        Recipel recipel = new Recipel();
        recipel.setRecipelId(NumberUtil.genUniqueKeyByTime());
        recipel.setRecipelName("白虎汤");
        recipelMapper.addRecipel(recipel);
        //3.写入处方详情
        List<DrugDTO>drugDTOS = emrDTO.getDrugDTOS();
        for (DrugDTO drugDTO:drugDTOS){
            RecipelDetail recipelDetail = new RecipelDetail();
            recipelDetail.setDrugDose(drugDTO.getDose());
            recipelDetail.setDrugName(drugDTO.getName());
            recipelDetail.setRecipelDetailId(NumberUtil.genUniqueKeyByTime());
            recipelDetail.setRecipelDetailNumber(recipel.getRecipelId());
            recipelDetailMapper.addRecipelDetail(recipelDetail);
        }
    }

}