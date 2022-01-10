package com.example.calculator;


public class Calculator {
        public int addAToB(int a, int b) {
            return a + b;
        }

        public int substractAFromB(int a, int b) {
            return b - a;
        }


    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result1 = calculator.addAToB(5, 6);
        int result2 = calculator.substractAFromB(5, 6);

        System.out.println(result1);
        System.out.println(result2);
    }
}
