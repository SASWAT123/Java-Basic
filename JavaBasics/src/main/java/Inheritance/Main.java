package Inheritance;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		//Student s = new Student();
		
		//Equals and Hashcode example
		Person p1 = new Person("p1", 10);
		Person p2 = new Person("p2", 11);
		Person p3 = p1;
		Person p4 = new Person("p1", 10);
		
//		System.out.println(p1.equals(p2));	//Print false since the address is different
//		System.out.println(p1.equals(p3));	//Print true since both the references are pointing to the same object
//		System.out.println(p1.equals(p4));
		
		Map<Person, Integer> person = new HashMap();
		
		person.put(p1, 10);
		person.put(p4, 11);
		
		System.out.println(person.size());
		
	}
	
}
