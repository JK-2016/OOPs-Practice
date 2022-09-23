package com.oops.basic;

import java.util.Arrays;
import java.util.Scanner;

public class MaxBorder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int tc =0;tc<t;tc++) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            String str = sc.nextLine();

            char arr[][] = new char[m][n];

            for (int i = 0; i < m; i++) {
                int j = 0;
                str = sc.nextLine();
                for (char c : str.toCharArray()
                ) {
                    arr[i][j] = c;
                    j++;
                }
            }
            int [] ae = new int[m];


            /* End of Input*/
//            printArray(arr,m,n);
            int cntMax = 0;
            int row = 0;
            for (; row < arr.length; row++) {
                for (int i = 0; i < n; i++) {
                    if ('#' == arr[row][i]) {
                        int cnt = 1;
                        int index =i;
                        while (isNextInRow(arr[row], index)) {
                            cnt++;
                            index++;
                        }
                        ;
                        cntMax = (cnt > cntMax) ? cnt : cntMax;
                        cnt = 1;
                        int rowIndex= row;
                        while (isNextInColumn(arr, i, rowIndex)) {
                            cnt++;
                            rowIndex++;
                        }

                        cntMax = (cnt > cntMax) ? cnt : cntMax;
                    }
                }
            }
            System.out.println(cntMax);
        }

    }

    public static boolean isNextInRow(char arr[],int index) {
        if (  index+1 < arr.length ) {
            if (arr[index + 1] == '#') {
                return true;
            }
        }
            return false;
    }
    public static boolean isNextInColumn(char arr[][],int index,int row) {
        if (row+1 < arr.length){
            if(arr[row + 1][index] == '#') {
                return true;
            }
        }
        return false;
    }
    public static void printArray(char arr[][],int m,int n){
         for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

}