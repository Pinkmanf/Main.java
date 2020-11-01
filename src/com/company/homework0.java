package com.company;

import java.util.Scanner;

public class homework0 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int b = a.nextInt();
        if (b % 2 == 0) {
            System.out.println("输出的是偶数");
        } else {
            System.out.println("输出的是奇数");
        }
    }
}