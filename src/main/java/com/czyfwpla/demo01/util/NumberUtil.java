package com.czyfwpla.demo01.util;

import java.util.Random;

/**
 * @Auther: Chandler
 * @Date: 2018/5/13 04:32
 * @Description: 动态生存id
 */
public class NumberUtil {

    /**
     * Description: 生成当前时间+6位随机数的id
     */
    public static synchronized String genUniqueKeyByTime() {
        Random random = new Random();
        Integer number = random.nextInt(900000) + 100000;

        return System.currentTimeMillis() + String.valueOf(number);
    }
    public static synchronized String genUniqueKeyByTitle() {
        Random random = new Random();
        Integer number = random.nextInt(9000) + 1000;

        return "20154490" + String.valueOf(number);
    }
}