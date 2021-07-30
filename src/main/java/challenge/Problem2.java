package challenge;

import java.util.LinkedList;
import java.util.Stack;

public class Problem2 {
    /* Problem 2: Write a program and show how to implement stack using Linked List in java.
    (note: implement your own linked list or use the one provided by java)

    Stack is a class, not an interface
     */
    public static void main(String[] args) {
        //use this to demonstrate its working...
StackList stack = new StackList<String>();
System.out.println(stack.empty());
stack.pop();//see if this breaks
stack.push("kevin");
stack.push("Mike");
stack.push("Anna");
System.out.println(stack.peek());
System.out.println(stack.search("Mike"));
stack.pop();
        System.out.println(stack.toString());


    }

}
