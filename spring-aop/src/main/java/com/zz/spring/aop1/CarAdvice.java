package com.zz.spring.aop1;


import org.aspectj.lang.JoinPoint;


/**
 * @author : Zak
 * @date : 2017年1月13日 下午3:45:46
 * @version : 2017年1月13日 Zak 首次创建
 */
public class CarAdvice {
  public void before( JoinPoint joinPoint ) {
    System.out.println("启动发动机~~");
  }
  public void after( JoinPoint jointPoint ) {
    System.out.println("关闭发动机~~~");
  }
}
