package Game.java;

public class JavaGame {
   package com.dev;


    public class JavaMaqa {
        static class Math {
            static int sum(int a, int b) {
                return a + b;
            }

            static int multiply(int a, int b) {
                return a * b;
            }
        }
    }

    public class Main2 {
        public static void main(String[] args) {

            int rf = Calculator.Math.sum(5, 7);
            int rg = Calculator.Math.multiply(3, 4);

            System.out.println("Сумма: " + rf);
            System.out.println("Произведение: " + rg);
        }

    }


}
}