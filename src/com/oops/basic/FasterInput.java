package com.oops.basic;
/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.*/
//imports for BufferedReader
/*import java.io.BufferedReader;
import java.io.InputStreamReader;*/

//import for Scanner and other utility classes
import java.util.*;
import java.util.stream.Collectors;
import java.io.*;

import java.lang.Math;

class FasterInput {
   static   ArrayList<Long> arr = new ArrayList<>();
    public static void sortList(ArrayList<Long> arr,int i){
        long pow1 =  (long) Math.pow(10,5*(i-1));
        Collections.sort(arr, new Comparator<Long>() {
            @Override
            public int compare(Long o1, Long o2) {
                if((o1/pow1)%100000 > (o2/pow1)%100000 ){
                    return 1;
                }
                else if((o1/pow1)%100000 < (o2/pow1)%100000 ){
                    return -1;
                }
                else {
                    return 0;
                }
            }
        });

    }



    public static void main(String args[] ) throws Exception {
        // Write your code here
        Reader sc = new Reader();
        PrintWriter out = new PrintWriter(System.out);
        int N = sc.nextInt();

        long max=0L,num;
        // pow = (long)Math.pow(10,5);

//        String str = sc.readLine();
        arr = sc.readLine(N);
// List<Integer> list = new ArrayList<>();
       /* StringTokenizer st = new StringTokenizer(str, " ");
        int j=0;
        while (st.hasMoreTokens()) {
//            System.out.println((st.nextToken()));

            arr.add(Long.parseLong(st.nextToken()));
//            System.out.println(arr.get(j));
            if(arr.get(j)>max) max= arr.get(j++);
//            j++;
        }*/
        System.out.println(arr.toString());
        max=Collections.max(arr);





        /*for(int i=0;i<N;i++){

            arr.add(sc.nextLong());
//            if(max<num) max = num;
        }*/
        System.out.println("End of Input");
        int i =1;

        // boolean isTrue=true;
        // int[]wt = new int [N];
        // long num,wt1;
        while(max>0){
            sortList(arr,i++);
            //   i++;
            String listString = arr.stream().map(Object::toString) .collect(Collectors.joining(" "));
            System.out.println(listString);
            System.out.println(i);
           /*for(int itr=0;itr<N;itr++){
                out.print(arr.get(itr)+" ");
                out.flush();
            }
            out.print("\n");*/
            // pow1 = (long) Math.pow(10,5*(i));
            // sortList(arr,i);
            // i++;
            max=max/100000;
        }

    }
    static class Reader {
        final private int BUFFER_SIZE = 1 << 16;
        private DataInputStream din;
        private byte[] buffer;
        private int bufferPointer, bytesRead;

        public Reader()
        {
            din = new DataInputStream(System.in);
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        public Reader(String file_name) throws IOException
        {
            din = new DataInputStream(
                    new FileInputStream(file_name));
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        public String readLine() throws IOException
        {
            byte[] buf = new byte[1000000]; // line length
            int cnt = 0, c;
            while ((c = read()) != -1) {
                if (c == '\n') {
                    if (cnt != 0) {
                        break;
                    }
                    else {
                        continue;
                    }
                }
                buf[cnt++] = (byte)c;
            }
            return new String(buf, 0, cnt);
        }
        public ArrayList<Long> readLine(int N) throws IOException
        {
            ArrayList<Long> arr =new ArrayList<>();
            byte[] buf = new byte[128]; // line length
            int cnt = 0, c;
            while ((c = read()) != -1) {
                if((int) c > 32 ){
                    buf[cnt++] = (byte)c;
                }
                else{
                    if(c==' '){
                        arr.add(Long.parseLong(new String(buf, 0, cnt)));
                        cnt=0;
                    }else if(c == '\n'){
                        if (cnt != 0) {
                            break;
                        }
                        else {
                            continue;
                        }
                    }
                }
                /*if (c == '\n') {
                    if (cnt != 0) {
                        break;
                    }
                    else {
                        continue;
                    }
                } else if (c == ' ') {
                    arr.add(Long.parseLong(new String(buf, 0, cnt)));
                    cnt=0;
//                    System.out.println(arr.toString());

                }
                else {
                    buf[cnt++] = (byte)c;
                }*/
            }
            arr.add(Long.parseLong(new String(buf, 0, cnt)));

            return arr;
        }


        public int nextInt() throws IOException
        {
            int ret = 0;
            byte c = read();
            while (c <= ' ') {
                c = read();
            }
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do {
                ret = ret * 10 + c - '0';
            } while ((c = read()) >= '0' && c <= '9');

            if (neg)
                return -ret;
            return ret;
        }

        public long nextLong() throws IOException
        {
            long ret = 0;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do {
                ret = ret * 10 + c - '0';
            } while ((c = read()) >= '0' && c <= '9');
            if (neg)
                return -ret;
            return ret;
        }

        public double nextDouble() throws IOException
        {
            double ret = 0, div = 1;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();

            do {
                ret = ret * 10 + c - '0';
            } while ((c = read()) >= '0' && c <= '9');

            if (c == '.') {
                while ((c = read()) >= '0' && c <= '9') {
                    ret += (c - '0') / (div *= 10);
                }
            }

            if (neg)
                return -ret;
            return ret;
        }

        private void fillBuffer() throws IOException
        {
            bytesRead = din.read(buffer, bufferPointer = 0,
                    BUFFER_SIZE);
            if (bytesRead == -1)
                buffer[0] = -1;
        }

        private byte read() throws IOException
        {
            if (bufferPointer == bytesRead)
                fillBuffer();
            return buffer[bufferPointer++];
        }

        public void close() throws IOException
        {
            if (din == null)
                return;
            din.close();
        }
    }

}


