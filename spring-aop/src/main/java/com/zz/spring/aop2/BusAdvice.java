package com.zz.spring.aop2;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


/**
 * @author : Zak
 * @date : 2017年1月13日 下午3:45:46
 * @version : 2017年1月13日 Zak 首次创建
 */
@Aspect
@Component
public class BusAdvice {
  @Pointcut( "execution(* *.drive(..))" )
  public void pointCut() {};

  @Before( "pointCut()" )
  public void before( JoinPoint joinPoint ) {
    System.out.println("启动发动机~~");
  }

  @After( "pointCut()" )
  public void after( JoinPoint jointPoint ) {
    System.out.println("关闭发动机~~~");
  }
}
