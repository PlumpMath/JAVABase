package com.zz.test.cglib;


import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;


/**
 * @author : Zak
 * @date : 2017年1月16日 下午6:10:32
 * @version : 2017年1月16日 Zak 首次创建
 */
public class CGLibProxy implements MethodInterceptor {
  private Enhancer enhancer;

  public <T> T getProxy( Class<T> clazz ) {
    enhancer = new Enhancer();
    enhancer.setSuperclass(clazz);
    enhancer.setCallback(this);

    return (T) enhancer.create();
  }

  @Override
  public Object intercept( Object object, Method method, Object[] args, MethodProxy proxy ) throws Throwable {
    System.out.println("before");
    proxy.invokeSuper(object, args);
    System.out.println("after");
    return null;
  }

}
