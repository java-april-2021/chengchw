
public class DDLTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DDL Link1 = new DDL();
		Node n1 = new Node(0);
		Node n2 = new Node(-3);
		Node n3 = new Node(3);
		Node n4 = new Node(-2);
		Node n5 = new Node(7);
		Node n6 = new Node(4);
		Node n7 = new Node(1);
		Node n8 = new Node(100);
		Node n9 = new Node(800);
		Node n10 = new Node(45);
		Node n11 = new Node(55);
	
		Link1.push(n1);
		Link1.push(n2);
		Link1.push(n3);
		Link1.push(n4);
		Link1.push(n5);
		Link1.push(n6);
		Link1.push(n7);
//		Link1.push(n1);
		Link1.printValueForward();
		System.out.println("-----------");
		Link1.printValueBackward();
		System.out.println("-----------");
		System.out.println(Link1.Size());
		System.out.println("-----------");
		Link1.pop();
		System.out.println(Link1.Size());
		System.out.println("-----------");
		Link1.printValueForward();
		System.out.println("-----------");
		Link1.printValueBackward();
		System.out.println("----Add-------");
		Link1.insertAt(n8,0);
		Link1.insertAt(n9,12);
		Link1.printValueForward();
		System.out.println("----Add- Middle------");
		Link1.insertAt(n10,4);
		Link1.insertAt(n11,6);
		Link1.printValueForward();
//		System.out.println(Link1.Size());
		System.out.println("----Remove- Middle------");
		Link1.removeAt(6);
		Link1.printValueForward();
		System.out.println("----Remove- Middle------");
		Link1.removeAt(0);
		Link1.printValueForward();
		System.out.println("----Remove- Middle------");
		Link1.removeAt(7);
		Link1.printValueForward();
		System.out.println("----Check Pali------");
		System.out.println(Link1.isPalindrome());
		
		DDL Link2 = new DDL();
		Node n12 = new Node(0);
		Node n13 = new Node(-3);
		Node n14 = new Node(3);
		Node n15 = new Node(3);
		Node n16 = new Node(-3);
		Node n17 = new Node(0);
		Link2.push(n12);
		Link2.push(n13);
		Link2.push(n14);
		Link2.push(n15);
		Link2.push(n16);
//		Link2.push(n17);
		System.out.println(Link2.isPalindrome());
		

	}

}
