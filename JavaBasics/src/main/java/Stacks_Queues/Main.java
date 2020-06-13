package Stacks_Queues;

import java.util.Collections;
import java.util.Stack;

public class Main {
	
	public static void main(String[] args) {
		
		//Implementing stack using collection framework
		Stack<Integer>stack = new Stack<>();
		System.out.println("Emplty stack : " + stack);
		
		//Adding elements into the stack
		stack.push(3);
		stack.push(4);
		stack.push(1);
		stack.push(2);
		
		System.out.println(stack.isEmpty());	//Returns true or false based on the whether the stack is empty or not
		System.out.println(stack.peek());		//Returns the top element inside a stack
		System.out.println(stack.pop());		//Returns the popped element from the stack
		
		Collections.sort(stack, Collections.reverseOrder());				//Sort the stack in the descending order
		Collections.sort(stack);											//Sort the stack in ascending order
		
		System.out.println("Elements in stack are : " + stack);

	}
	
}
