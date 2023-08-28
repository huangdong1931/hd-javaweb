package com.web.test;

import java.util.Scanner;

public class demo01 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("请输入一个三位数");
    int num = sc.nextInt();
    System.out.println(num);

    int g = num % 10;
    int s = (num / 10) % 10;
    int b = num / 100;
    System.out.println("百位:"+ b + " 十位:" + s + " 个位:" + g);
  }
}
