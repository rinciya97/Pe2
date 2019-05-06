package com.stackroute.pe2;

import java.util.Arrays;
import java.util.Scanner;

public class GradeOfStudents {
    public static void main(String args[]){
        minAndMaxMethod(5);
    }
    public static void minAndMaxMethod(int totalNo)
    {
        Scanner sc=new Scanner(System.in);
        int Student[]=new int[totalNo];
        double Average=0;

        for(int i=0;i<totalNo;i++)
        {
            System.out.print("Enter the student "+i+"Marks");
            Student[i]=sc.nextInt();
        }
        Arrays.sort(Student);
        System.out.println("Minimum Value is"+Student[0]);
        System.out.println("Maximum Value is"+Student[totalNo-1]);
        for(int i=0;i<totalNo;i++)
        {
            Average=Student[i]+Average;
        }
        Average=Average/totalNo;
        System.out.print(Average);
    }
}
