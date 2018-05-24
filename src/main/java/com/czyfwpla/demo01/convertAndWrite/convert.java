package com.czyfwpla.demo01.convertAndWrite;

import com.czyfwpla.demo01.DTO.DrugDTO;
import com.czyfwpla.demo01.DTO.EmrDTO;
import com.czyfwpla.demo01.model.Emr;
import com.czyfwpla.demo01.model.RecipelDetail;
import com.czyfwpla.demo01.util.NumberUtil;

/**
 * @Auther: Chandler
 * @Date: 2018/5/24 23:13
 * @Description: 转化为数据库可以写入的对象
 */
public class convert {
    public static Emr emrDTO2Emr(EmrDTO emrDTO){
        Emr emr =new Emr();
        emr.setEmrId(NumberUtil.genUniqueKeyByTime());
        emr.setSecTion(emrDTO.getSecTion());
        emr.setTime(emrDTO.getTime());
        emr.setName(emrDTO.getName());
        emr.setSex(emrDTO.getSex());
        emr.setAge(emrDTO.getAge());
        emr.setIdCard(emrDTO.getIdCard());
        emr.setPhone(emrDTO.getIdCard());
        emr.setUnit(emrDTO.getUnit());
        emr.setZhifa(emrDTO.getZhifa());
        emr.setZhushu(emrDTO.getZhushu());
        emr.setSizhen(emrDTO.getSizhen());
        emr.setLczd(emrDTO.getLczd());
        emr.setZxing(emrDTO.getZxing());
        emr.setYwgms(emrDTO.getYwgms());
        emr.setBingW(emrDTO.getBingW());
        emr.setBxing(emrDTO.getBxing());
        emr.setRecipelNumber(NumberUtil.genUniqueKeyByTime());
        return emr;
    }
    public static void drug2RecipelDetail(DrugDTO drugDTO ,String recipelNumber){
        RecipelDetail recipelDetail = new RecipelDetail();
        recipelDetail.setDrugDose(drugDTO.getDose());
        recipelDetail.setDrugName(drugDTO.getName());
        recipelDetail.setRecipelDetailId(NumberUtil.genUniqueKeyByTime());
        recipelDetail.setRecipelDetailNumber(recipelNumber);
    }
}