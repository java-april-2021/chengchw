public class Node{

    private int value;
    private Node next;

    public Node(int InputVal){

        this.value = InputVal;
        this.next = null;

    }

    public void setVal(int InputVal){

        this.value = InputVal;
    }

    public int getVal(){

        return this.value;

    }

    public Node getNext(){

        return this.next;
    }

    public void setNext(Node InputNext){

        this.next = InputNext;
    }

}