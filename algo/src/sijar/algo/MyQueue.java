package sijar.algo;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;

public class MyQueue {

      //Queue queue = new ArrayDeque();
    //Queue queue = new PriorityBlockingQueue();
        //Queue queue = new PriorityQueue();
    //Queue queue = new ArrayBlockingQueue(40);
    //Queue<Character> queue = new DelayQueue<>();
    //Queue queue = new LinkedTransferQueue();
    Queue queue = new ConcurrentLinkedDeque();
//    Queue queue = new ArrayDeque();
//    Queue queue = new ArrayDeque();
//    Queue queue = new ArrayDeque();

    //Queue queue = new SynchronousQueue();



    public static void main(String[] args) {
        String _infix = "a+b-c*(d/e)";
        String _polynomial = "a*x*x + b*x + c";

        MyQueue _queueObj = new MyQueue();
        doAllQueueOperations(_infix, _queueObj);
        doAllQueueOperations(_polynomial,_queueObj);

    }


    /**
     *
     * @param _infix
     * @param _queueObj
     */
    private static void doAllQueueOperations(String _infix, MyQueue _queueObj) {
        //push
        for(int i=0; i<_infix.length(); ++i){
            System.out.println("Item added into the queue : " + _infix.charAt(i) );
            _queueObj.queue.add(_infix.charAt(i));
        }
        System.out.println(_queueObj.queue);
        System.out.println("=============================================");
        //peek
        System.out.println("Peek item in Queue :" + _queueObj.queue.peek());

        //search
        //for(int i=0; i<_infix.length(); ++i){
          //  System.out.println("Searching element for "+ _infix.charAt(i) + " in queue :" + _queueObj.queue.element());
        //}

        System.out.println("=============================================");
        //pop
        while(!_queueObj.queue.isEmpty()){
            System.out.println("Removed out of Queue :" +  _queueObj.queue.remove());
        }
        System.out.println(_queueObj.queue);
        System.out.println("=============================================");

        //search
        for(int i=0; i<_infix.length(); ++i){
            System.out.println("Offering for "+ _infix.charAt(i) + " in queue :" + _queueObj.queue.offer(_infix.charAt(i)));
        }
        System.out.println("=============================================");
        System.out.println(_queueObj.queue);
    }

}
