package com.first;

public class q3 {

        public static void main(String[] args)
        {
            String str = "Ashitaaaaaaaaaaaaaaaaa";
            int count = str.length() - str.replace("a", "").length();
            System.out.println("Number of occurances of 'a' in "+str+" = "+count);
        }
    }

