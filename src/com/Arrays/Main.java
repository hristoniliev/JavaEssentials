package com.Arrays;

import java.util.Arrays;

public class Main {

    public  static void main(String[] args) {
	// write your code here
        int [] numbers = new int[4];
        numbers[0] = 0;
        numbers[1] = 56;
        numbers[2] = 67;
        numbers[3] = 756;
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers[numbers.length-1]);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        String [] names = {"ico", "kris"};
        System.out.println(Arrays.toString(names));
        for (String name : names) {
            if(name.equals("ico")){
                continue;
            }
            System.out.println(name);
        }
        char [] letters = {'A', 'B', 'C', 'D', 'A', 'A', 'D'};
        count(letters);
        int searchLetter = search(letters, 'B');
        System.out.println(searchLetter + " times");
    }

    public static void count(char [] letters){
        for (char letter : letters){}
        System.out.println(letters.length + " letters - "
                + Arrays.toString(letters));
        //System.out.println(Arrays.toString(letters));
    };
    public static int search(char [] letters, char searchLetter){
        int count = 0;
        for (char letter : letters) {
            if(letter == searchLetter){
                count++;
            }
        }
        return count;
    };
}
