package com.czyfwpla.demo01.mapper;

import com.czyfwpla.demo01.model.Emr;
import com.czyfwpla.demo01.model.Hero;
import com.czyfwpla.demo01.util.Page;

import java.util.List;

/**
 * @Auther: Chandler
 * @Date: 2018/5/13 03:14
 * @Description:
 */
public interface EmrMapper {
    //一、增加病历
    void addEmr(Emr emr);
}
