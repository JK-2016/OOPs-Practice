package com.oops.basic;

import java.math.BigInteger;
import java.util.Scanner;

public class MaxModulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long k , num,maxmod,mod=0L;
        String s,st;
        int m;
        while(t>0){
            m = sc.nextInt();
            k = sc.nextLong();
            maxmod= 0L;
            s=sc.nextLine();
            s = sc.nextLine();
            System.out.println(s);
            int ini=0;
            num= parseLong(s);
            maxmod=num%(k);
            if(num>=k){
                while(s.charAt(ini)=='0'){
                    ini++;
                }
                for(int i=ini; i<m ;i++){
                    st = s.substring(ini,i)+s.substring(i+1,m);
                    //    System.out.println(st);
                    //mod =Long.parseLong(st)%k;
                    mod = parseLong(st) % k;//new BigInteger(st).mod(k);
                    maxmod =mod>maxmod?mod:maxmod;

                }
            }
            System.out.println(maxmod);
            t--;
        }

    }
    public static long parseLong( String s){
        long num=0;
        long dec=1;
        for(int i=s.length()-1; i>=0;i--){
            num+= (s.charAt(i)-'0')*dec;
            dec*=10;
        }
        return num;
    }
}
