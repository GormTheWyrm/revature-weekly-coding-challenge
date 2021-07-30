package challenge;

import java.util.LinkedList;



/* Problem 2: Write a program and show how to implement stack using Linked List in java.
(note: implement your own linked list or use the one provided by java)
*/
public class StackList <E> { //implements Stack
    LinkedList<E> internalList = new LinkedList<E>();
    //fix generics




    public boolean empty(){
        //returns true if internalList is empty
        if (this.internalList.size()==0){
            return true;
        }
        else{
            return false;
        }
    }
    public int search(E element){//add parameter

        return this.internalList.lastIndexOf(element);
    }
    public E push(E element){ //add parameter...
//        boolean works =
                this.internalList.offerLast(element);
//        if (works == true) {
            return element;
//        }
//        else { return null; }
//        }
    } //should this be able to return null?


    //...WIP
    public E pop(){
        if (this.internalList.size()>0){
            return this.internalList.removeLast();
        }
        else {
            return null;
        }

    }
    public E peek(){

        return this.internalList.peekLast();
    }



    @Override
    public String toString() {



        return this.internalList.toString();
    }
}
