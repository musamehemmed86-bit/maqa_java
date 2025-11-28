package Homework4;

import java.util.HashSet;

import java.util.TreeSet;

public class maqa6maqa {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();

        numbers.add(10);
        numbers.add(5);
        numbers.add(10); // повтор
        numbers.add(7);

        System.out.println(numbers);
    }
    //2  ?
    //3
    TreeSet<Integer> tree = new TreeSet<>();

        tree.add(20)
        tree.add(1);
        tree.add(50);
        tree.add(3);
        tree.add(3); // повтор

        System.out.println(tree);
}
