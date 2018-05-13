package com.czyfwpla.demo01.util;

import java.util.List;

/**
 * @Author: Chandler
 * @Description:
 * @Date: 23:28 2018-04-15
 */
public class Page<T> {
  private int firstIndex=0;//起始页
  private int pageSize;//每页的数量
  private int pageCount=1;//当前页
  private int totalPageCount;//总页数
  private int totalDataCount;//数据总量
  private List<T>list;//实体类数组

  public int getFirstIndex() {
    return firstIndex;
  }

  public void setFirstIndex(int firstIndex) {
    this.firstIndex = firstIndex;
  }

  public int getPageSize() {
    return pageSize;
  }

  public void setPageSize(int pageSize) {
    this.pageSize = pageSize;
  }

  public int getPageCount() {
    return pageCount;
  }

  public void setPageCount(int pageCount) {
    this.pageCount = pageCount;
  }

  public int getTotalPageCount() {
    return totalPageCount;
  }

  public void setTotalPageCount(int totalPageCount) {
    this.totalPageCount = totalPageCount;
  }

  public int getTotalDataCount() {
    return totalDataCount;
  }

  public void setTotalDataCount(int totalDataCount) {
    this.totalDataCount = totalDataCount;
  }

  public List<T> getList() {
    return list;
  }

  public void setList(List<T> list) {
    this.list = list;
  }
}
