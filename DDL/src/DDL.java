
public class DDL {

	
	public Node head;
	public Node tail;
	private int NumOfNode;
	
	public DDL() {
		
		this.head = null;
		this.tail = null;
		this.NumOfNode = 0;
	}
	
	public void push(Node inputnode) {
		
		this.NumOfNode += 1;
		if (this.head == null) {
			
			this.head = inputnode;
			this.tail = inputnode;
			return;
		}
		
		else {
			
			inputnode.prev = this.tail;
			this.tail.next = inputnode;
			this.tail = inputnode;
			return;
			
		}	
	}
	
	public void printValueForward() {
		
		Node pointer = this.head;
		
		while(pointer != null) {
			
			System.out.println(pointer.getVal());
			pointer = pointer.next;
		}
	}
	
	public void printValueBackward() {
		
		Node pointer = this.tail;
		
		while(pointer != null) {
			
			System.out.println(pointer.getVal());
			pointer = pointer.prev;
		}
	}
	
	public Node pop() {
		
		
		if (this.tail == null) {
			
			System.out.println("Nothing in the list");
			return null;
		}
		
		else {
			
			Node popNode = this.tail;
			this.tail = this.tail.prev;
			this.tail.next = null;
			popNode.prev = null;
			this.NumOfNode -= 1;
			
			return popNode;
			
		}
	}
	
	public int Size() {
		
		return this.NumOfNode;
	}
	
	
	public void insertAt(Node newNode, int index) {
		
		
		if (index == 0) {
			
			newNode.next = this.head;
			this.head.prev = newNode;
			this.head = newNode;
			this.NumOfNode += 1;
			return;
		}
		
		else if (index >= this.NumOfNode-1) {
			
			newNode.prev = this.tail;
			this.tail.next = newNode;
			this.tail = newNode;
			this.NumOfNode += 1;
//			this.tail.next = null;
			return;
		}
		
		else {
			
			if(index > this.NumOfNode/2) {
				
				int ptindex = this.NumOfNode -1;
				Node pointer = this.tail;
				
				while(ptindex != index) {
					
					pointer = pointer.prev;
					ptindex -= 1;
				}
				
				newNode.next = pointer;
				newNode.prev = pointer.prev;
				pointer.prev.next = newNode;
				pointer.prev = newNode;	
				this.NumOfNode += 1;
				return;
			}
			
			else {
				
				int ptindex = 0;
				Node pointer = this.head;
				
				while(ptindex != index) {
					
					pointer = pointer.next;
					ptindex += 1;
				}
				
				newNode.next = pointer;
				newNode.prev = pointer.prev;
				pointer.prev.next = newNode;
				pointer.prev = newNode;
				this.NumOfNode += 1;
				return;
			}		
		}
	}
	
	public void removeAt(int index) {
		
		if(index > this.NumOfNode - 1) {
			
			System.out.println("No node in the index");
			return;
		}
		
		else if (index == 0) {
			
			head = head.next;
			head.prev = null;
			this.NumOfNode -= 1;
			return;
		}
		
		else if (index == this.NumOfNode - 1) {
			
			this.pop();
		}
		
		else {
			
			if(index > this.NumOfNode/2) {
				
				int ptindex = this.NumOfNode -1;
				Node pointer = this.tail;
				
				while(ptindex != index) {
					
					pointer = pointer.prev;
					ptindex -= 1;
				}
				
				pointer.prev.next = pointer.next;
				pointer.next.prev = pointer.prev;
				
				this.NumOfNode -= 1;
				return;
			}
			
			else {
				
				int ptindex = 0;
				Node pointer = this.head;
				
				while(ptindex != index) {
					
					pointer = pointer.next;
					ptindex += 1;
				}
				
				pointer.prev.next = pointer.next;
				pointer.next.prev = pointer.prev;
				this.NumOfNode -= 1;
				return;
			}		
		}	
	}
	
	public boolean isPalindrome() {
		
		Node forPt = this.head;
		Node backPt = this.tail;
		
		for (int i = 0; i < this.NumOfNode /2; i++) {
			
			if (forPt.getVal() != backPt.getVal()) {
				
				return false;
			}
		}
		return true;
	}
	
	
	
}
