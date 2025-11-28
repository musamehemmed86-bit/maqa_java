package Homework3;

import java.util.ArrayList;

public class maqa3maqa {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Inare");
        names.add("Nihad");
        names.add("Ali");
        names.add("Maqa");
        names.add("Ali");

        int first = names.indexOf("Ali");      // первое вхождение
        int last = names.lastIndexOf("Ali");   // последнее вхождение

        System.out.println("Повтаряющиеся имена: " + first);
        System.out.println("Все имена: " + last);
    }
}
