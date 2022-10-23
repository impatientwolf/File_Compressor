package com.example.rle;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public class RLE {
    public static void main(String[] args) throws IOException {
        File path=new File("C:/Users/Priyanshu/Downloads/decompressed.txt");
        compress(path);

    }
    public static void compress(File file) throws IOException {
        String filedirectory= file.getParent();
        FileInputStream fis=new FileInputStream(file);
        FileOutputStream fos=new FileOutputStream("compressed.txt");
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
        for(String stri : k){
            if(stri!=null)str+=stri;
        }
        for(int ii=0;ii<str.length();ii++){
            fos.write(str.charAt(ii));
        }
        fis.close();
        fos.close();
    }

    public static void decompress(File file) throws IOException {
        String filedirectory= file.getParent();
        FileInputStream fis=new FileInputStream(file);
        FileOutputStream fos=new FileOutputStream("decompressed.txt");
        String in="";
        int i;
        while((i=fis.read())!=-1){
            in=in+(char)i;
        }
        String[] arrOfStr = in.split("/");
        ArrayList<String> k=new ArrayList<>();
        for(String j:arrOfStr){
            String[] temp=j.split(":");

            k.add(temp[0]+temp[1]);

        }
        String str="";
        for(String j:k){
            for(int ii=0;ii<j.charAt(0)%48;ii++){
                str=str+j.charAt(1);

            }
//            System.out.println(j.charAt(0));

        }
        for(int ii=0;ii<str.length();ii++){
            fos.write(str.charAt(ii));
//            System.out.println((char) str.charAt(ii));
        }

        fis.close();
        fos.close();

    }

}
