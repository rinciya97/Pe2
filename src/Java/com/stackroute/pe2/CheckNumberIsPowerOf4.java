package com.stackroute.pe2;

public class CheckNumberIsPowerOf4 {
    public static String checkPowerOf4Method(int n)
    {   String result="";
        if(n == 0) {
            result = "Number is 0";
            System.out.print(result);
            return result;
        }
        else if(n == 1) {
            result = "Number is 1";
            System.out.print(result);
            return result;
        }
        while(n != 1)
        {
            if(n % 4 != 0) {
                result = "Number is not a power of 4";
                return result;
            }
            n = n / 4;
        }
        result="Number is a power of 4";
        return result;
    }

}
