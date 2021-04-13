public class SinglyLinkedList{


    private Node head;
    
    public SinglyLinkedList(){

        this.head = null;

    }

    public void add(int val){

        Node NewNode = new Node(val);

        if (head == null){

            head = NewNode;
        }

        else{

            Node pointer = head;
            while(pointer.getNext() != null){

                pointer = pointer.getNext();
            }

            pointer.setNext(NewNode);
        }

    }

    public void remove(){

        Node pointer = head;

        while(pointer.getNext().getNext() != null){

            pointer = pointer.getNext();
        }

        pointer.setNext(null);

    }

    public void printNode(){

        Node pointer = head;

        while(pointer != null){

            System.out.println(pointer.getVal());
            pointer = pointer.getNext();
        }

    }

    public boolean find(int val){

        Node pointer = head;
        boolean valfind = false;

        while(pointer != null || valfind){

            if (pointer.getVal() == val){

                valfind = true;
                System.out.println("Found");
                System.out.println(pointer.getVal());
                return true;
            }

            pointer = pointer.getNext();
            
        }
        System.out.println("No node been found");
        return false;

    }

    public void removeAt(int nthnode){

        Node pointer = head;
        int NodeIndex = 0;

        if (nthnode == 0){

            pointer = head;
            head = head.getNext();
            pointer.setNext(null);
            return;

        }
        while(pointer.getNext().getNext() != null && NodeIndex != nthnode){

            pointer = pointer.getNext();
            NodeIndex += 1;

        }

        if (pointer.getNext().getNext() == null){

            if(NodeIndex == nthnode-1){
            pointer.setNext(null);
            }

            else{
                System.out.println("Invalid Index");
            }
        }

        else{

            pointer.setNext(pointer.getNext().getNext());
        }

    } 


        







    



}