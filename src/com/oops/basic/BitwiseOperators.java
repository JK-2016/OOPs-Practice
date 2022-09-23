package com.oops.basic;

import java.util.ArrayList;
import java.util.List;

public class BitwiseOperators {
    public static void main(String[] args) {
        int i =2;
        int j= i<<1;
        int k = i>>1;
        int n = j>>1;
        int neg = ~i;
        System.out.println(i+" "+ j +" "+ k+" "+ n);
        System.out.println(neg);
//        neg = neg<<<1;
        System.out.println(neg);
        neg= neg>>>2;
        System.out.println(neg);
        List<Integer> q = new ArrayList<>();


    }

}
