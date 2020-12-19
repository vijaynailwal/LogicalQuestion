package com.vijay.extra;

public class SwapTwoNumbers {

    public static void main(String[] args) {
        int a = 10, b = 20, temp;
        //1.using third variable
        /*
        temp=a;
        a=b;
        b=temp;
        System.out.println(a+"  "+b);
*/
        //2.without third variable + and - operator
        /*
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a+" "+b);
*/
        //3.without third variable * / but the value not be zero
        /*
        a=a*b;
        b=a/b;
        a=a/b;
        System.out.println(a+" "+b);
*/
        //4.bitwise operator xor
        /*a=a^b;
        b=a^b;
        a=a^b;
        System.out.println(a+" "+b);
*/
        //5.single statement swap
        b = (a + b) - (a = b);
        System.out.println(a + " " + b);

    }
}
