package sijar.algo;


import java.util.Stack;


public class MyStack {

    Stack<Character> stack = new Stack<>();


    public static void main(String[] args) {
        String _infix = "a+b-c*(d/e)";
        String _polynomial = "a*x*x + b*x + c";

        MyStack _stackObj = new MyStack();
        doAllStackOperations(_infix, _stackObj);
        doAllStackOperations(_polynomial,_stackObj);

    }


    /**
     *
     * @param _infix
     * @param _stackObj
     */
    private static void doAllStackOperations(String _infix, MyStack _stackObj) {
        //push
        for(int i=0; i<_infix.length(); ++i){
            System.out.println("Item pushed into the stack : " + _infix.charAt(i) );
            _stackObj.stack.push(_infix.charAt(i));
        }
        System.out.println(_stackObj.stack);
        System.out.println("=============================================");
        //peek
        System.out.println("Top item in SimpleStack :" + _stackObj.stack.peek());
        System.out.println("=============================================");

        //search
        for(int i=0; i<_infix.length(); ++i){
            System.out.println("Searching for "+ _infix.charAt(i) + " in stack :" + _stackObj.stack.search(_infix.charAt(i)));
        }

        System.out.println("=============================================");
        //pop
        while(!_stackObj.stack.empty()){
          System.out.println("Top poped out of SimpleStack :" +  _stackObj.stack.pop());
        }
        System.out.println(_stackObj.stack);
        System.out.println("=============================================");

        //search
        for(int i=0; i<_infix.length(); ++i){
            System.out.println("Searching for "+ _infix.charAt(i) + " in stack :" + _stackObj.stack.search(_infix.charAt(i)));
        }
        System.out.println("=============================================");
    }


}
