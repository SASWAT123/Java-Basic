package LinkedList;

public class LinkedList {
	
	public Node head;
	
	public LinkedList() {
		this.head = null;
	}
		
	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}
	
	//Add elements to the last of the LinkedList
	public void addLast(Integer data) {
		if(data == null) {
			return;
		}
		
		//Create a new Node to add to the LinkedList
		Node newNode = new Node(data);
		
		if(this.getHead() == null) {
			this.setHead(newNode);
		}else {
			Node current = this.getHead();
			while(current.getNext() != null) {
				current = current.getNext();
			}
			current.setNext(newNode);
		}
	}
	
	//Add Elements to the front of the LinkedList
	public void addFront(Integer data) {
		if(data == null) {
			return;
		}
		
		Node newNode = new Node(data);
		if(this.getHead() == null) {
			this.setHead(newNode);
		}else {
			newNode.setNext(this.getHead());
			this.setHead(newNode);
		}
	}
	
	//Add elements in the middle of the LinkedList
	public void addMiddle(Integer data, Integer position) {
		if(data == null || position == null) {
			return;
		}
		
		Node newNode = new Node(data);
		
		if(this.getHead() == null) {
			this.setHead(newNode);
		}else {
			int i = 0;
			Node current = this.getHead();
			while(current.getNext() != null) {
				if(i == position) {
					newNode.setNext(current.getNext());
					current.setNext(newNode);
					return;
				}else {
					i++;
				}
			}
		}
	}
		
	public void printList() {
		Node current = this.getHead();
		
		System.out.print("LinkedList is : ");
		
		//Traverse through the LinkedList
		while(current != null) {
			System.out.print(current.getData() + " ");
			current = current.getNext();
		}
	}

}
