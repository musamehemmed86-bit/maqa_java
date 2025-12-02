package maqa123;

import java.util.*;

public class maqa123 {
    public static void main(String[] args) {

        // -------------------- ДЗ 1 --------------------
        System.out.println("=== ДЗ 1 ===");
        HashMap<String, Integer> map1 = new HashMap<>();
        map1.put("Ali", 20);
        map1.put("Nihad", 18);
        map1.put("Kanan", 25);
        map1.put("Aynur", 22);
        map1.put("Elvin", 19);
        map1.put("Ali", 30); // дубликат ключа – старое значение заменится
        map1.put("Murad", 27);

        for (String name : map1.keySet()) {
            System.out.println(name + " → " + map1.get(name));
        }


        System.out.println("=== ДЗ 2 ===");
        LinkedHashMap<Integer, String> lessons = new LinkedHashMap<>();
        lessons.put(1, "Введение в Java");
        lessons.put(2, "Переменные");
        lessons.put(3, "Условия");
        lessons.put(4, "Коллекции");
        lessons.put(5, "Исключения");

        for (Integer num : lessons.keySet()) {
            System.out.println(num + " → " + lessons.get(num));
        }


        // -------------------- ДЗ 3 --------------------
        System.out.println("=== ДЗ 3 ===");
        TreeMap<Integer, String> games = new TreeMap<>();
        games.put(95, "GTA 5");
        games.put(88, "Minecraft");
        games.put(99, "The Witcher 3");
        games.put(76, "CS:GO");
        games.put(92, "RDR2");
        games.put(85, "Fortnite");
        games.put(91, "FIFA 24");
        games.put(80, "Roblox");

        for (Integer rating : games.keySet()) {
            System.out.println(rating + " → " + games.get(rating));
        }


        // -------------------- ДЗ 4 --------------------
        System.out.println("=== ДЗ 4 ===");
        HashMap<String, Integer> math = new HashMap<>();
        math.put("Ali", 90);
        math.put("Nihad", 85);
        math.put("Kanan", 70);
        math.put("Aynur", 88);

        HashMap<String, Integer> english = new HashMap<>();
        english.put("Ali", 80);
        english.put("Nihad", 75);
        english.put("Aynur", 95);
        english.put("Elvin", 60);

        System.out.println("Имена, которые есть в обеих Map:");
        for (String name : math.keySet()) {
            if (english.containsKey(name)) {
                System.out.println(name);
            }
        }


        // -------------------- ДЗ 5 --------------------
        System.out.println("=== ДЗ 5 ===");
        NavigableMap<Integer, String> nav = new TreeMap<>();
        nav.put(10, "A");
        nav.put(20, "B");
        nav.put(30, "C");
        nav.put(40, "D");
        nav.put(50, "E");

        System.out.println("Меньше 25: " + nav.lowerKey(25));
        System.out.println("Больше 25: " + nav.higherKey(25));
        System.out.println("floor(30): " + nav.floorKey(30));
        System.out.println("ceiling(30): " + nav.ceilingKey(30));
    }
}
