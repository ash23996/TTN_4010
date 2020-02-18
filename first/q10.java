package com.first;

class Calculator {
    int Operation(int num1, int num2) {
        return num1 + num2;
    }

    double Operation(double num1, double num2) {
        return num1 +num2;
    }

    float Operation(float num1, float num2) {
        return num1 * num2;
    }

    String Operation(String s1, String s2) {
        return s1+s2;
    }
    String Operation(String s1, String s2,String s3) {
        return s1+s2+s3;
    }
}
public class q10
{
    public static void main(String[] args) {
        Calculator cal=new Calculator();
        System.out.println("adding of two integer number:1 +2="+cal.Operation(1,2));
        System.out.println("adding of two float:4.5d +6.6d="+cal.Operation(4.5d,6.6d));
        System.out.println("multipication of two  float :4.5f*7.4f="+cal.Operation(4.5f,7.4f));
        System.out.println("concation  of two string:ashita+kumar="+cal.Operation("ashita","kumar"));
        System.out.println("cancation of three strinng:smriti+ashita+kumar="+cal.Operation("smriti","ashita","kumar"));
    }
}
