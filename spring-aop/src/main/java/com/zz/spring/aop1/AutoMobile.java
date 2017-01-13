package com.zz.spring.aop1;


/**
 * @author : Zak
 * @date : 2017年1月13日 下午3:39:27
 * @version : 2017年1月13日 Zak 首次创建
 */
public class AutoMobile implements Car {

  @Override
  public void drive() {
    System.out.println("开汽车啦");
  }

}
