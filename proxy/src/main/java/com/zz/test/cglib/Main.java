package com.zz.test.cglib;


/**
 * @author : Zak
 * @date : 2017年1月16日 下午6:17:02
 * @version : 2017年1月16日 Zak 首次创建
 */
public class Main {

  public static void main( String[] args ) {
    CGLibProxy proxy = new CGLibProxy();
    Student student = proxy.getProxy(Student.class);
    student.sayHello();

  }

}
