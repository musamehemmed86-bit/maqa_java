package travel.java;

public class travel {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {
            int result = divide(a, b);
            System.out.println("Результат: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: деление на ноль недопустимо!");
        }
    }

    public static int divide(int x, int y) {
        if (y == 0) {
            throw new ArithmeticException("Деление на ноль");
        }
        return x / y;


    }
    //3

        try

    {
        int result = (a, b);
        System.out.println("Результат: " + result);
    }
        catch(
    ArithmeticException e)

    {
        System.out.println("Ошибка: деление на ноль недопустимо!");
    } finally

    {
        System.out.println("Блок finally выполнен: программа завершила попытку деления.");
    }
}

public static int divide(int x, int y) {
    if (y == 0) {
        throw new ArithmeticException("Деление на ноль");
    }
    return x / y;

}