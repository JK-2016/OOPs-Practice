package com.oops.basic;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

public class LinkedList<T> {
    public class Node{
        Node(T data){
            this.data=data;
            this.prev=null;
            this.next= null;
        }
        T data;
        Node prev;
        Node next;
        private boolean hasNext(){
            if(this.next==null){
                return false;
            }
            return true;
        }
        private boolean hasPrev(){
            if(this.prev==null){
                return false;
            }
            return true;
        }
    }

    Node first;
    Node last;
    long size=0;
    public T add(T data){
        Node temp = new Node(data);
        if(this.size==0){
            this.first=temp;
            this.last=temp;
            size++;
        }
        else{
            this.last.next=temp;
            temp.prev=last;
            last=temp;
            size++;
        }
        return data;
    }
    public T get(long index) throws IndexOutOfBoundsException{
        long itr;
        if(index>this.size-1 || index<0){
            IndexOutOfBoundsException IndexOutOfBoundsException = new IndexOutOfBoundsException();
            throw IndexOutOfBoundsException;
        }
        if(index>size/2){
            itr = size-1;
            Node temp=this.last;
            while(index<itr){
                temp = temp.prev;
                itr--;
            }
            return temp.data;
        }
        else{
            itr =0;
            Node temp = this.first;
            while(itr<index){
                temp=temp.next;
                itr++;
            }
            return temp.data;
        }
    }

    public long IndexOf(T data){
        long ind1=0, ind2= this.size-1;
        Node temp1= this.first;
        Node temp2 = this.last;
        while(temp1.next!=null){
            if(temp1.data==data){
                return ind1;
            } else if (temp2.data==data) {
                return ind2;
            }
            ind1++;
            ind2--;
        }
        return -1L;
    }
    private Node NodeAt(long index) throws IndexOutOfBoundsException{
        if(index>this.size-1 || index<0){
            IndexOutOfBoundsException IndexOutOfBoundsException = new IndexOutOfBoundsException();
            throw IndexOutOfBoundsException;
        }
        long itr;
        if(index>size/2){
            itr = size-1;
            Node temp=this.last;
            while(itr>index){
                temp = temp.prev;
                itr--;
            }
            return temp;
        }
        else{
            itr =0;
            Node temp = this.first;
            while(itr<index){
                temp=temp.next;
                itr++;
            }
            return temp;
        }
    }
    public T sort(){
        //Merge sort//
        long l =0, r=this.size-1;
        mergeSort(l,r);

        return this.last.data;
    }
    private Node mergeSort(long l,long r){
        if(l==r) {
            return this.NodeAt(l);
        }

            long m = (l + r) / 2;
           Node left = mergeSort(l, m);
           Node right = mergeSort(m, r);
           while(compare(left,right)==-1){

           }


    }
    public int compare(Node left, Node right){
        if(left.data.com     right.data){
            return -1;
        }
        else return 1;
    }




    public static void main(String[] args) throws IOException {
        LinkedList<Long> list = new LinkedList<>();
        Reader sc = new Reader();
        int N = sc.nextInt();
        for(int i=0;i<N;i++){
            list.add(sc.nextLong());
        }
        System.out.println(list.size);
        for(int i=0;i<N;i++){
            System.out.println(list.get(i)+" ");
        }
        System.out.println(list.NodeAt(3).prev.data);

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
