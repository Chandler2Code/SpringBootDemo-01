package com.czyfwpla.demo01.util;

/**
 * @Auther: Chandler
 * @Date: 2018/4/20 22:34
 * @Description: 复用Page分页计算分页参数 不管对象是什么，只需要传入2个参数即可
 */
public class PageUtil {
    public static Page<Object> queryPage(Integer currentPage,int queryCount,int pageSize){
        Page<Object> page= new Page<>();
        int firstIndex =pageSize*(currentPage-1);//计算起始计数位置
        page.setPageSize(pageSize);//设置每页的数量
        int totalPageCount = (queryCount+ page.getPageSize()-1)/page.getPageSize();//计算page的页数
        page.setFirstIndex(firstIndex);
        page.setTotalPageCount(totalPageCount);
        page.setPageCount(currentPage);
        page.setTotalDataCount(queryCount);

        return page;
    }
}