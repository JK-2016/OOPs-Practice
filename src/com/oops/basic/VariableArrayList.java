package com.oops.basic;

import java.util.ArrayList;
import java.util.Scanner;

public class VariableArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tcs = sc.nextInt();
        ArrayList<Integer> [] arrayLists = new ArrayList[tcs];

       // int arr[][] = new int [t][N];
        for(int i=0; i<tcs;i++){
            int N = sc.nextInt();
            arrayLists[i]=new ArrayList<>(N);
            for(int j=0;j<N;j++){
                arrayLists[i].add(sc.nextInt());

            }
        }

        while (tcs>=0){

            tcs--;
        }
    }
}
