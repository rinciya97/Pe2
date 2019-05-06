package com.stackroute.pe2;

import java.io.BufferedReader;
import java.io.FileReader;

public class ConvertTheFileInUpperCase {
    public static void main(String args[]) throws Exception
    {
        ConvertInUpperCase();
    }
    public static int ConvertInUpperCase() throws Exception
    {
        int count=0;
        BufferedReader readData=new BufferedReader(new FileReader("file.txt"));
        String line;
        while ((line=readData.readLine())!=null){
            System.out.println(line.toUpperCase());
            count++;
        }
        System.out.println("size of file is "+count+" line/lines");
        return count;
    }


}
