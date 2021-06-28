package com.DataStructures;

import java.util.LinkedList;
import java.util.Queue;

public class WorkingWithQueues {
    public static void main(String[] args) {
        Queue<Person> queue = new LinkedList<>();
        queue.add(new Person("James"));
        queue.add(new Person("Johny"));
        queue.add(new Person("Diane"));
        System.out.println(queue);
        System.out.println(queue.peek());//See the bottom(The first that came in)
        queue.poll();//Remove the bottom(The first that came in)
        System.out.println(queue);
        System.out.println();
        //FIRST IN FIRST OUT - FIFO

        //Loop
        for (Person person : queue) {
            System.out.println(person);
        }
        System.out.println();
        //Loop
        for (int i = 0; i <= queue.size(); i++) {
            System.out.println(queue.poll());
        }
    }

    static class Person{
        String name;

        public Person(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
}
