package com.oops.basic;

import java.util.Scanner;

public class BufferedSpring {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
//        sb.ensureCapacity(N);
        int K= sc.nextInt();
        String s;
        for (int i = 0; i <N ; i++) {
            s= (sc.nextInt()+"a");
//            System.out.println(s);


            sb.insert(i ,s);
        }
        System.out.println(sb);
    }
}
