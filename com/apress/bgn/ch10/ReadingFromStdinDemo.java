package com.apress.bgn.ch10;

import java.io.IOException;

public class ReadingFromStdinDemo{

  public static void main(String... args) throws IOException{
    System.out.print("Press any key to terminate:");

    byte[] b =new byte[3];
    int read =System.in.read(b);
    for(int i=0;i<b.length;i++){
      System.out.println(b[i]);
    }
    System.out.println("Key pressed: " + read);
  }
}

