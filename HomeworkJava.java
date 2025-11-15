package homework;

import java.util.Scanner;

public class HomeworkJava {
    public static void checkAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("Вам нет 18!");
        } else {
            System.out.println("Добро пожаловать");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Задание 1 — Деление:");
        try {
            System.out.print("Введите число a: ");
            int a = sc.nextInt();

            System.out.print("Введите число b: ");
            int b = sc.nextInt();

            int result = a / b;
            System.out.println("Результат: " + result);

        } catch (ArithmeticException e) {
            System.out.println("На ноль делить нельзя!");
        } finally {
            System.out.println("Работа завершена");
        }

        System.out.println("----------------------------");

        System.out.println("Задание 2 — Массив:");

        int[] arr = {10, 20, 30, 40};

        try {
            System.out.print("Введите индекс (0-3): ");
            int index = sc.nextInt();

            System.out.println("Элемент: " + arr[index]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Такого индекса не существует");
        }

        System.out.println("----------------------------");


        System.out.println("Задание 3 — Несколько catch:");

        try {
            int x = 10 / 0;
            int[] nums = {1, 2, 3};
            System.out.println(nums[10]);

        } catch (ArithmeticException e) {
            System.out.println("Ошибка деления на ноль");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: неправильный индекс массива");
        }

        System.out.println("Обработка завершена");

        System.out.println("----------------------------");


        System.out.println("Задание 4 — Собственное исключение:");

        try {
            System.out.print("Введите возраст: ");
            int age = sc.nextInt();

            checkAge(age);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }



}
