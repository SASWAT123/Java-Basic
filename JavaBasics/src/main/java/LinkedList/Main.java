package LinkedList;

public class Main {
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.addLast(1);
		list.addLast(2);
		list.addFront(6);
		list.addLast(3);
		list.addLast(4);
		list.addFront(5);
		list.addMiddle(7, 3);
		
		list.printList();
	}

}
