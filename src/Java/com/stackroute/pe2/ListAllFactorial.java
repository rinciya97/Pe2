package com.stackroute.pe2;

public class ListAllFactorial {
    public static void main(String[] args)
    {
        ListAllFactorial aFactorialInt = new ListAllFactorial();

        System.out.println("Int factorials:");
        aFactorialInt.printIntFactorials();

        System.out.println("Long factorials:");
        aFactorialInt.printLongFactorials();
    }

    private void printIntFactorials()
    {
        int i  = 1;
        int fn = 1;
        while (true)
        {
            System.out.println("The factorial of "+i+"is "+fn);
            if (Integer.MAX_VALUE / fn < (i+1)) {
                System.out.println("The factorial of "+(i+1)+ "is out of range");
                break;
            }
            i++;
            fn =fn* i;
        }

    }

    private void printLongFactorials()
    {
        long i  = 1L;
        long fn = 1L;
        while (true)
        {
            System.out.println("The factorial of "+i+"is "+fn);
            if (Long.MAX_VALUE / fn < (i+1)) {
                System.out.println("The factorial of "+(i+1)+ "is out of range.");
                break;
            }
            i++;
            fn =fn* i;
        }

    }

}
