package com.zz.test.jdkproxy;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


/**
 * @author : Zak
 * @date : 2017年1月16日 下午5:08:21
 * @version : 2017年1月16日 Zak 首次创建
 */
public class JdkProxy implements InvocationHandler {
  private Object obj;

  @SuppressWarnings( "unchecked" )
  public <T> T getProxy( T obj ) {
    this.obj = obj;
    return (T) Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), this);
  }

  @Override
  public Object invoke( Object proxy, Method method, Object[] args ) throws Throwable {
    System.out.println("动态代理开始！");
    Object reVal = method.invoke(obj, args);
    System.out.println("动态代理结束！");
    return reVal;
  }

}
