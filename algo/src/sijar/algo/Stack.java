/*
 * Developed by Sijar Ahmed on 28/1/19 5:34 PM
 * Last modified 28/1/19 5:34 PM.
 * Sijar Ahmed (sijar.ahmed@gmail.com)
 * Copyright (c) 2019. All rights reserved.
 *
 *
 * The Class / Interface Stack is responsible for...
 * @author sijarahmed
 * 28/1/19 5:34 PM
 *
 */

package sijar.algo;

import java.util.Arrays;

public class Stack<E>{

    private static final int STACK_SIZE=Integer.MAX_VALUE/8;


    private int top = -1;
    private E[] elements = (E[]) new Object[STACK_SIZE];


    protected void push(E item){
        if(top < elements.length -1){
            elements[++top] = item;
         }else {
            //throw new StackOverflowError("stack is full");
            System.err.print(" stack is full ");
        }
        return;
    }



    protected E pull() {
        if (top >= 0) {
            return elements[top--];
        } else{
            //throw new StackOverflowError("no elements left to pull");
            System.err.print(" no elements left to pull ");
            System.err.print("top :" + top);
            System.err.print("Size :" + elements.length);
            return null;
        }
    }


    @Override
    public String toString() {
        return "sijar.algo.Stack{" +
                "top=" + top +
                ", elements=" + Arrays.toString(elements) +
                '}';
    }





    public static void main(String[] args) {
    	System.out.println("Total Memory :" + Runtime.getRuntime().totalMemory());

        Stack<String> stringStack = new Stack<>()  ;
        for(int k =0 ; k < 10000000 ; ++k) {
            stringStack.push("ABC");
            stringStack.push("CDE");
            stringStack.push("XA1");
            stringStack.push("XA2");
            stringStack.push("XA3");
            stringStack.push("XA4");
            stringStack.push("XA5");
            stringStack.push("AOBC");
            stringStack.push("WCDE");
            stringStack.push("WXA1");
            stringStack.push("SOXA2");
            stringStack.push("QOXA3");
            stringStack.push("WOXA4");
            stringStack.push("WOXA5");
        }

        //System.out.println("Total Size of sijar.algo.Stack" + stringStack.elements.length);
        System.out.println("Currentl capacity of sijar.algo.Stack :" + stringStack.top);
        //System.out.println(stringStack);

        for(;;) {
            String popElement = stringStack.pull();
            //System.err.print("Poped :" + popElement +   " top :" + stringStack.top);
        }
   }




}




