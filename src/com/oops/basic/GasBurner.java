package com.oops.basic;
import java.util.*;
public class GasBurner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        ArrayList<Integer> arr= new ArrayList<Integer>(N);
        for(int i=0; i<N;i++){
                arr.add(sc.nextInt());
        }

        /* EOI*/
        Collections.sort(arr,Collections.reverseOrder());
        ArrayList<Integer> bs = new ArrayList<>(K);
        ArrayList<Integer> sp = new ArrayList<>(N-K);
        for (int i = 0; i < K; i++) {
            bs.add(arr.get(i));
        }
        for (int i = 0; i < N-K; i++) {
            sp.add(arr.get(K+i));
        }
        int time =0;
        while(bs.get(K-1)>=sp.get(0) && sp.get(0)>0){
            if(bs.get(0)==sp.get(0)){
                time+=1;
                for (int i = 0; i < K; i++) {
                    bs.set(i,bs.get(i)-1);
                }
            }
            else{
                time += sp.get(0);
                for (int i = 0; i < K; i++) {
                    bs.set(i, bs.get(i) - sp.get(0));
                }
            }
            /*rearrange*/
            while((bs.get(K-1)==0 && sp.get(0)>0) || bs.get(K-1)<sp.get(0)) {
                int temp = bs.get(K - 1);
                bs.set(K - 1, sp.get(0));
                sp.set(0, temp);
                Collections.sort(bs, Collections.reverseOrder());
                Collections.sort(sp, Collections.reverseOrder());
            }
        }
        time += bs.get(K-1);
        System.out.println(time);

    }
}
