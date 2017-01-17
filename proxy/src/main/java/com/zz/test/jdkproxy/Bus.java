package com.zz.test.jdkproxy;


/**
 * @author : Zak
 * @date : 2017年1月16日 下午5:07:12
 * @version : 2017年1月16日 Zak 首次创建
 */
public class Bus implements Car {

  @Override
  public void drive() {
    System.out.println("老司机开车啦！");
  }

  @Override
  public void start() {
    System.out.println("开始！！");

  }

}
