package com.example.rle;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public class RLE {
    public static void main(String[] args) {


    }
    public void compress(File file) throws IOException {
        String filedirectory= file.getParent();
        FileInputStream fis=new FileInputStream(file);
        FileOutputStream fos=new FileOutputStream(filedirectory+"compressed.txt");
        String in="";
        int i;
        while((i=fis.read())!=-1){
            in=in+(char)i;
        }

        char[] a=new char[in.length()];
        for(int j=0;j<in.length();j++)a[j]=in.charAt(j);

        String[] k = new String[a.length];
        int num = 0;
        int counter = 0;
        int count=0;
        String str="";
        char x = a[0];
        while (counter < a.length) {
            if (x == a[counter]) {
                num += 1;
            } else {
                k[count] = (num + ":" + a[counter - 1] + "/");
                count++;
                num = 1;
            }
            x = a[counter];
            counter += 1;
        }
        k[count] = (num + ":" + a[counter - 1] + "/");
        for(String i : k){
            if(i!=null)str+=i;
        }


    }

    public void decompress(File file) throws IOException {
        String filedirectory= file.getParent();
        FileInputStream fis=new FileInputStream(file);
        FileOutputStream fos=new FileOutputStream(filedirectory+"decompressed.txt");
        String in="";
        int i;
        while((i=fis.read())!=-1){
            in=in+(char)i;
        }
        String[] arrOfStr = in.split("/");
        ArrayList<Character> k=new ArrayList<>();
        for(String j:arrOfStr){
            k.add(j.split(":"))

        }


    }
}
