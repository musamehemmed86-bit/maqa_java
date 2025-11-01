package maqa;

public class maqa {
    public static void main(String[] args) {
        //2
        System.out.print("Введите строку: ");
        String text = "привет меня зовут мага";

        System.out.println("Исходная строка: " + text );

        String upper = text.toUpperCase();
        System.out.println("Большие буквы: " + upper);

        String lower = text.toLowerCase();
        System.out.println("Маленькие буквы: " + lower);
//3
        String maqa = "п    р   и   в   е   т   к   а   к   д   е  л   а" ;

        String trimmed = maqa.trim();

        System.out.println( maqa + trimmed );

//6
   System.out.print("Введите строку: ");
String text3 = "Hi ьгыф hov are you";

        System.out.println("Введите, что нужно заменить (A): ");
String oldschool = "ьгыф";

        System.out.println("Введите, на что нужно заменить (B): ");
String newschool = "суэль";

String qwer = text3.replace(oldschool, newschool);

        System.out.println("Исходная строка: " + text3);
        System.out.println("Результат после замены: " + qwer);

        //7
        System.out.println("Введите строку:");
        String text98 = "Hello Java world!";

        System.out.println("Введите префикс для проверки:");
        String qqq = "Hello";

        System.out.println("Введите суффикс для проверки:");
        String suffix = "world!";
        boolean starts = text.startsWith(qqq);
        boolean ends = text.endsWith(suffix);

        System.out.println("Исходная строка: " + text98 );
        System.out.println("Начинается с " + qqq + starts);
        System.out.println("Заканчивается на " + suffix  + ends);
//9

        String text17 = "Java programming is fun";
        String text21 = "programming";

        int startIndex = 5;


        boolean result9 = text17.regionMatches(startIndex, text21, 0, text21.length());

        // Вывод результатов
        System.out.println("Строка 1: " + text17 );
        System.out.println("Строка 2: "+ text21);
        System.out.println("Совпадает ли часть строки? " + result9);


            }}