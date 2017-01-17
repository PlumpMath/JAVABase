package com.zz.test;


import com.zz.test.cglib.CGLibProxy;
import com.zz.test.jdkproxy.Bus;
import com.zz.test.jdkproxy.Car;
import com.zz.test.jdkproxy.JdkProxy;


/**
 * @author : Zak
 * @date : 2017年1月17日 上午11:52:23
 * @version : 2017年1月17日 Zak 首次创建
 */
public class Compare {

  public static void main( String[] args ) {
    Bus bus = new Bus();
    JdkProxy jdkProxy = new JdkProxy();
    CGLibProxy cglibProxy = new CGLibProxy();
    long jdkproxyInitTime = 0, cglibproxyinitTime = 0, jdkInvokeTime = 0, cglibInvokeTime = 0, startTime = 0;
    for( int i = 0; i < 2000001; i++ ) {
      System.out.println(i);
      switch(i % 2) {
        case 0:// JDKProxy
          startTime = System.currentTimeMillis();
          Car car = jdkProxy.getProxy(bus);
          jdkproxyInitTime += System.currentTimeMillis() - startTime;

          startTime = System.currentTimeMillis();
          car.drive();
          jdkInvokeTime += System.currentTimeMillis() - startTime;

          break;
        case 1:// CGLib

          startTime = System.currentTimeMillis();
          Car car1 = cglibProxy.getProxy(Bus.class);
          cglibproxyinitTime += System.currentTimeMillis() - startTime;

          startTime = System.currentTimeMillis();
          car1.drive();
          cglibInvokeTime += System.currentTimeMillis() - startTime;

      }
    }
    System.out.println("~~~~~~~~~~~~~~~~~~~~~Result~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println("JDKInitTtime:" + jdkproxyInitTime);
    System.out.println("jdkInvokeTime:" + jdkInvokeTime);
    System.out.println("cglibproxyinitTime:" + cglibproxyinitTime);
    System.out.println("cglibInvokeTime:" + cglibInvokeTime);
  }

}
