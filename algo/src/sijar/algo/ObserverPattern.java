/*
 * Developed by Sijar Ahmed on 2/2/19 12:08 PM
 * Last modified 1/2/19 5:02 PM.
 * Sijar Ahmed (sijar.ahmed@gmail.com)
 * Copyright (c) 2019. All rights reserved.
 *
 *
 * The Class / Interface Observer design pattern is responsible for...
 * @author sijarahmed
 * 2/2/19 12:08 PM
 *
 */

package sijar.algo;

import java.util.ArrayList;
import java.util.List;



class Subject{

    private int state=0;
    private List<Observer> observers = new ArrayList<>();

    void setState(int state) {
        this.state = state;
        // any change in state of the subject and subject
        // is manually pushing the state change notification to all the observers
        notifyAllObservers();
    }

    void notifyAllObservers(){
        for(Observer e : observers){
            e.updateState();
        }
    }

    int getState(){
        return state;
    }

    void register_Observer(Observer client){
        observers.add(client);
    }

}


abstract class Observer{
    Subject subject;
    //register with subject
    abstract void register();
    //print the change in the all the obversers
    abstract void updateState();
}



class Observer_Client1 extends Observer{
    @Override
    void updateState() {
        //print the change in the all the obversers
        System.out.println( this.getClass() + " recieved the changed in state " + this.subject);
    }

    @Override
    void register(){
        subject.register_Observer(this);
    }
}

class Observer_Client2 extends Observer{

    @Override
    void updateState() {
        //print the change in the all the obversers
        System.out.println( this.getClass() + " recieved the changed in state " + this.subject);
    }

    @Override
    void register(){
        subject.register_Observer(this);
    }
}



public class ObserverPattern {

        public static void main(String[] args) {
        Subject subject = new Subject();
        subject.setState(10);
        subject.setState(20);
        subject.setState(30);
        subject.setState(40);

    }
}


