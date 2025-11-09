package school;


public class    JavaSchool {
    public static void main(String[] args) {
//1
        System.out.print("Введите строку: ");
        String input = "Maqa";

        // Проверяем, состоит ли строка только из букв (A–Z или a–z)
        if (input.matches("[A-Za-z]+")) {
            System.out.println("Это слово");
        } else {
            System.out.println("Это не слово");
        }

    }




    //2

    String text = "Я учусь в 9 классе, мне 14 лет, у брата 21.";

        while (matcher.find(),) {
        System.out.println("Найдено: " + text);
    }





//3
        System.out.print("Введите строку: ");
    String text = "Hello Java from Developia school";



    // Поиск и вывод слов
        while (matcher.find()) {
        System.out.println(text);
    }

}