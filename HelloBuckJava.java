package com.facebook.buck.demo;

import java.io.FileOutputStream;
import java.io.File;
import java.io.IOException;

public class HelloBuckJava {
  public static void main(String[] args) {
    System.out.println("Hello " + HelloString.getHelloString());
  }

   public static void foo () throws IOException{
    FileOutputStream fos = new FileOutputStream(new File("whatever.txt"));
    try {
      fos.write(7);
    } finally {
//      fos.close();
    }
  }

  
  
}
