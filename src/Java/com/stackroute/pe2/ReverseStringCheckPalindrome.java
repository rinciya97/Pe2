package com.stackroute.pe2;

public class ReverseStringCheckPalindrome {
    public static String CheckPalindrome(String str) {
        String output = "";
        if (str != ""&&str!=null) {
            StringBuffer sb = new StringBuffer(str);
            String s = new String(sb.reverse());
            if (str.equals(s)) {
                output = "Palindrome";
                System.out.println(output);

            } else {
                output = "Not Palindrome";
                System.out.println(output);
            }
            return output;
        }
        else
        {
            output="Empty String";
            return output;
        }
    }

}
