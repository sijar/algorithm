/*
 * Developed by Sijar Ahmed on 28/1/19 5:34 PM
 * Last modified 28/1/19 5:34 PM.
 * Sijar Ahmed (sijar.ahmed@gmail.com)
 * Copyright (c) 2019. All rights reserved.
 *
 *
 * The Class / Interface DynamicStack is responsible for...
 * @author sijarahmed
 * 28/1/19 5:34 PM
 *
 */

package sijar.algo;

import java.util.Arrays;

public class DynamicStack<E> {

	
    private static final int INITIAL_CAPACITY=5;
    
    private int top = -1;
    private E[] elements = (E[]) new Object[INITIAL_CAPACITY];


    protected void push(E item){
        if(top == elements.length -1){
        	increase_stackCapacity();
        	}
         elements[++top] = item;
        return;
    }



    private void increase_stackCapacity() {
    	E[] temp_elements = (E[]) new Object[elements.length + INITIAL_CAPACITY];
    	System.arraycopy(elements, 0, temp_elements, 0, elements.length);
    	elements = temp_elements;
	}



	protected E pull() {
		E e;
		System.out.println(this.toString());
    	if(top >= 0){
        e = elements[top--];
		adjust_stackCapacity();
		System.out.println("Element poped =========> :" + e);
        return e;
    	} else {
            System.err.print(" no elements left to pull ");
            System.err.print("top :" + top);
            System.err.print("Size :" + elements.length);
            throw new StackOverflowError("no elements left to pull");
    	}}


    private void adjust_stackCapacity() {
    	if((top + 1) % INITIAL_CAPACITY == 0){
    	E[] temp_elements = (E[]) new Object[top+1];
    	System.arraycopy(elements, 0, temp_elements, 0, top+1);
    	elements = temp_elements;     
		}
	}



	@Override
    public String toString() {
        return "sijar.algo.Stack{" +
                "top=" + top +
                ", sijar.algo.Stack Size=" + elements.length +
                ", elements=" + Arrays.toString(elements) +
                '}';
    }

	
	public static void main(String[] args) {
        DynamicStack<String> stringStack = new DynamicStack<>()  ;
        System.out.println("Hashcode :" +  stringStack.hashCode() +  " "+ (stringStack.hashCode() & 0x7fffffff)% 12);

        for(int k =0 ; k < 1 ; ++k) {
            stringStack.push("ABC");
            System.out.println(stringStack);
            stringStack.push("CDE");
            stringStack.push("XA1");
            stringStack.push("XA2");
            stringStack.push("XA3");
            stringStack.push("XA4");
            stringStack.push("XA5");
            stringStack.push("AOBC");
            stringStack.push("WCDE");
            System.out.println(stringStack);
            stringStack.push("WXA1");
            stringStack.push("SOXA2");
            stringStack.push("QOXA3");
            stringStack.push("WOXA4");
            stringStack.push("WOXA5");
            System.out.println(stringStack);
        }
        for(int k =0 ; k < 10 ; ++k) {
            stringStack.pull();
            System.out.print(stringStack);
            stringStack.pull();
            stringStack.pull();
            stringStack.pull();
            stringStack.pull();
            stringStack.pull();
            stringStack.pull();
            stringStack.pull();
            stringStack.pull();
            System.out.print(stringStack);
            stringStack.pull();
            stringStack.pull();
            stringStack.pull();
            stringStack.pull();
            stringStack.pull();
            System.out.println(stringStack);

        }
        //System.out.println("Total Size of sijar.algo.Stack" + stringStack.elements.length);
        System.out.println("Currentl capacity of sijar.algo.Stack :" + stringStack.top);
        //System.out.println(stringStack);

	}


}
