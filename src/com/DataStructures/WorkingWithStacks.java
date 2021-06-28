package com.DataStructures;

import java.util.Stack;

public class WorkingWithStacks {
    public static void main(String[] args) {
        Stack<Integer> numbersStack = new Stack<>();
        numbersStack.push(1);
        numbersStack.push(2);
        numbersStack.push(3);
        numbersStack.push(5);
        System.out.println(numbersStack.peek());//See the top
        numbersStack.pop();//Removes the top element
        numbersStack.pop();//Removes the next top element
        System.out.println(numbersStack);

        //LAST IN FIRST OUT - LIFO

        //Loop
        for (Integer integer : numbersStack) {
            System.out.println(integer);
        }
    }
}
