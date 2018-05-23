package com.czyfwpla.demo01.mapper;

import com.czyfwpla.demo01.model.Emr;
import com.czyfwpla.demo01.model.Recipel;
import com.czyfwpla.demo01.model.RecipelDetail;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


/**
 * @Auther: Chandler
 * @Date: 2018/5/23 00:10
 * @Description:
 */

@SpringBootTest
@RunWith(SpringRunner.class)
public class EmrMapperTest {

    @Autowired
    private  EmrMapper mapper;
    @Autowired
    private RecipelMapper recipelMapper;

    @Autowired
    private RecipelDetailMapper recipelDetailMapper;

    @Test
    public void addEmr() {
        Emr emr =new Emr();
        emr.setEmrId("1316");
        emr.setSecTion("儿科门诊");
        emr.setTime("2116-7-21 :08:07");
        emr.setName("李思思");
        emr.setSex("女");
        emr.setAge("22");
        emr.setPhone("18382469025");
        emr.setIdCard("51052219");
        emr.setUnit("四川成都");
        emr.setZhushu("上呼吸道感染");
        emr.setSizhen("上呼吸道感染");
        emr.setLczd("上呼吸道感染");
        emr.setZxing("风热症");
        emr.setYwgms("***");
        emr.setZhifa("^^^");
        emr.setBingW("^^^");
        emr.setBxing("88888");
        emr.setRecipelNumber("20154490");
        mapper.addEmr(emr);
    }

    @Test
    public void addRecipel(){
        Recipel recipel = new Recipel();
        recipel.setRecipelName("白虎汤");
        recipel.setRecipelId("20154492");
        recipelMapper.addRecipel(recipel);
    }

    @Test
    public void addRecipelDetail(){
        RecipelDetail recipelDetail = new RecipelDetail();
        recipelDetail.setRecipelDetailNumber("20154491");
        recipelDetail.setRecipelDetailId("33552652");
        recipelDetail.setDrugDose("5g");
        recipelDetail.setDrugName("蒲公英");
        recipelDetailMapper.addRecipelDetail(recipelDetail);
    }
}