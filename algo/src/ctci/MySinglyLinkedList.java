/*
 * Developed by Sijar Ahmed on 27/05/22, 7:05 PM
 * Last modified 03/02/19, 5:50 PM.
 * Sijar Ahmed (sijar.ahmed@gmail.com)
 * Copyright (c) 2022. All rights reserved.
 *
 *
 * The Class / Interface MySinglyLinkedList is responsible for...
 * @author sijarahmed
 * 27/05/22, 7:05 PM
 *
 */

package ctci;

public class MySinglyLinkedList<E> {

    private LinkedNode<E> head;

    public void add(E item){
        if(head == null){
            head = new LinkedNode<>(item,null);
            return;
        }

        LinkedNode curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = new LinkedNode<>(item,null);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        LinkedNode curr = head;
        while(curr != null){
            sb.append(curr);
            curr = curr.next;
        }
        return sb.toString();
    }

    /**
     *
     * @param <E>
     */
    private class LinkedNode<E> {
       E item;
       LinkedNode<E> next;

        public LinkedNode(E item, LinkedNode<E> next) {
            this.item = item;
            this.next = next;
        }

        @Override
        public String toString() {
            return "{" + item +" } --> ";
        }
    }


    public static void main(String[] args) {
        MySinglyLinkedList<Integer> list = new MySinglyLinkedList<>();
        list.add(12);
        list.add(11);
        list.add(10);
        list.add(1);
        list.add(0);
        list.add(8);
        list.add(9);
        list.add(112);
        list.add(3);
        list.add(69);
        list.add(11);

        System.out.println(list);
    }




}
