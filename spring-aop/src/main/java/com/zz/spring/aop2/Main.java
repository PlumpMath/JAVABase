package com.zz.spring.aop2;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * @author : Zak
 * @date : 2017年1月13日 下午3:52:50
 * @version : 2017年1月13日 Zak 首次创建
 */
public class Main {
  public static void main( String[] args ) {
    ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext2.xml");
    Car car = (Car) ctx.getBean("bus");
    car.drive();
  }
}
