package com.company;

import javax.management.ListenerNotFoundException;

public class homework2 {
    public static void main(String[] args) {
        String strD = "acbdw,12695,47AasIDX";
        String[] strings = strD.split(",");
        char[] a = strings[1].toCharArray();
        for (int i = 1; i <= a.length; i++) {
            if (a[i] < '0' || a[i] > '9') {
                System.out.println("第一部分没有数字");
                if (a[i] >= 65 && a[i] <= 90) {
                    System.out.println("第一部分含有大写字母");
                }
            }
        }
        char[] b = strings[2].toCharArray();
        for (int j = 1; j <= b.length; j++) {
            if (b[j] > 97 && b[j] < 122) {
                b[j] -= 32;
            }
        }
        char[] c = strings[3].toCharArray();
        for (int n = 0; n <= c.length; n++)
        {
            if ((c[n] > 97 && c[n] < 122) || (c[n] > 65 && c[n] < 90))
            {
                for (int e = 0; e < c.length - 1; e++)
                {
                    for (int f = 0; f < c.length - 1; f++) {
                        if (c[f] > c[f + 1]) {
                            char t = c[f];
                            c[f] = c[f + 1];
                            c[f + 1] = t;
                        }
                    }

                }
                System.out.println("从小到大排序后的结果是:");

                for (int g = 0; g < c.length; g++)
                {
                    System.out.print(c[g] + " ");
                }
            }
            else
            {
                System.out.print("字符串不单单由字母组成");
            }
        }
    }
}