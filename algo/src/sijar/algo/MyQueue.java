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
    private Queue queue = new ConcurrentLinkedDeque();
//    Queue queue = new ArrayDeque();
//    Queue queue = new ArrayDeque();
//    Queue queue = new ArrayDeque();
    //Queue queue = new SynchronousQueue();


    /**
     *
     */
    void serviceAndPeek(){
        while(!queue.isEmpty()){
            System.out.println("Servicing the item << " +  queue.peek() + " >>");
            Object servered_item =  queue.poll();
            System.out.println("Item is been servered {{ " +  servered_item + " }}");
            System.out.println(queue + "\n");
        }
    }



    public static void main(String[] args) {
        String _infix = "a+b-c*(d/e)";
        String _polynomial = "a*x*x + b*x + c";
        String[] agents = "abc,def,ghi,jkl,mno,pqr,stu,vwx,yz1".split(",");

                //MyQueue _queueObj = new MyQueue();
        //doAllQueueOperations(_infix, _queueObj);
        //doAllQueueOperations(_polynomial,_queueObj);

        MyQueue _queueObj = new MyQueue();
        //push
        for(int i=0; i<agents.length; ++i){
            System.out.println("Item added into the queue : " + agents[i]);
            _queueObj.queue.add(agents[i]);
        }
        _queueObj.serviceAndPeek();
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
