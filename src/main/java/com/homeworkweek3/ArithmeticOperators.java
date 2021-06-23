package com.homework;

public class ArithmeticOperators {

    public static void main(String[] args) {

        int v = 20;
        int m = 40;

        int r1;
        int r2;

        //addition ope
        System.out.println(v + m);

        //subtraction ope
        System.out.println(v - m);

        //multiplication ope
        System.out.println(v * m);

        //division ope
        System.out.println(v / m);

        //module ope
        System.out.println(v % m);

        //increment ope
        r1 = ++v;
        System.out.println("Increment: "+ v);

        // decrement ope
        r2 = --m;
        System.out.println("Decrement: "+ m);
    }
}
