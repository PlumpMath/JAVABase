package com.zz.classloader;


/**
 * @author : Zak
 * @date : 2017年1月17日 下午3:22:58
 * @version : 2017年1月17日 Zak 首次创建
 */
public class Main {

  public static void main( String[] args )
      throws ClassNotFoundException, InstantiationException, IllegalAccessException {
    ClassLoader threadLoader = Thread.currentThread().getContextClassLoader();
    System.out.println(threadLoader);
    ClassLoader loader = Main.class.getClassLoader();
    System.out.println(System.class.getClassLoader());
    System.out.println(loader);
    MyClassLoader myloader = new MyClassLoader();
    Class<?> clazz = myloader.loadClass("com.zz.classloader.Man");
    Human people = (Human) clazz.newInstance();
    people.sayHello();
    System.out.println(clazz.getClassLoader());
  }

}
