package com.zz.classloader;


import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


/**
 * @author : Zak
 * @date : 2017年1月18日 下午5:00:18
 * @version : 2017年1月18日 Zak 首次创建
 */
public class MyClassLoader extends ClassLoader {
  private File dir = new File("");

  @Override
  protected Class<?> findClass( String name ) throws ClassNotFoundException {
    String fileName = name.substring(name.lastIndexOf(".") + 1);
    System.out.println(dir.getAbsolutePath());
    System.out.println(fileName);
    File targetFile = new File(dir.getAbsolutePath() + File.separator + fileName + ".class");
    try {
      FileInputStream fis = new FileInputStream(targetFile);
      ByteArrayOutputStream bos = new ByteArrayOutputStream();
      byte[] byteArray = null;
      try {
        System.out.println(fis.available());
        byteArray = new byte[fis.available()];;
        while(fis.read(byteArray) != -1) {
          bos.write(byteArray);
        }
      }
      catch(IOException e) {
        e.printStackTrace();
      }
      byteArray = bos.toByteArray();
      return defineClass(name, byteArray, 0, byteArray.length);
    }
    catch(FileNotFoundException e) {
      throw new ClassNotFoundException(name);
    }
  }

}
