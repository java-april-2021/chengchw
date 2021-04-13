public class ListTester{

    public static void main(String[] args){

        SinglyLinkedList SLL = new SinglyLinkedList();

        SLL.add(2);
        SLL.add(2);
        SLL.add(5);
        SLL.add(-23);
        SLL.add(-5);
        SLL.add(3);
        SLL.add(-6);
        SLL.add(2);
        SLL.add(8);
        SLL.add(3);
        SLL.add(4);
        
        SLL.printNode();
        System.out.println("break");
        SLL.remove();
        SLL.remove();
        SLL.remove();
        SLL.printNode();

        SLL.find(2);
        SLL.find(5);
        SLL.find(7);
        System.out.println("Remove Head");
        SLL.removeAt(0);
        SLL.printNode();
        System.out.println("Remove 3");
        SLL.removeAt(3);
        SLL.printNode();
        // SLL.removeAt(7);
        System.out.println("Remove Tail");
        SLL.removeAt(5);
        SLL.printNode();

        System.out.println("Out Of bound");
        SLL.removeAt(5);
        SLL.printNode();


    }


}