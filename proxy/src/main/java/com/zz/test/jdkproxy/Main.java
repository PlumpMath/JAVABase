package com.zz.test.jdkproxy;


/**
 * @author : Zak
 * @date : 2017年1月16日 下午5:19:47
 * @version : 2017年1月16日 Zak 首次创建
 */
public class Main {

  public static void main( String[] args ) {
    Car car = new Bus();
    JdkProxy jdkProxy = new JdkProxy();
    Car proxyCar = jdkProxy.getProxy(car);
    proxyCar.start();
    proxyCar.drive();
  }

}
