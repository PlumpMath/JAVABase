package com.zz.spring.aop2;


import org.springframework.stereotype.Component;


/**
 * @author : Zak
 * @date : 2017年1月13日 下午3:39:27
 * @version : 2017年1月13日 Zak 首次创建
 */
@Component( "bus" )
public class Bus implements Car {

  @Override
  public void drive() {
    System.out.println("开公交车啦");
  }

}
