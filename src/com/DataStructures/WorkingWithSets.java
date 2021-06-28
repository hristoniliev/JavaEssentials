package com.DataStructures;

import java.util.HashSet;
import java.util.Set;

public class WorkingWithSets {
    public static void main(String[] args) {
        Set<Character> characters = new HashSet<>();
        characters.add('A');
        characters.add('B');
        characters.add('A'); //Duplicates NOT allowed in Set
        characters.add('C');
//Order is not guaranteed!!
        for (Character character : characters) {
            System.out.println(character);
        }
        System.out.println(characters.size());
    }
}
