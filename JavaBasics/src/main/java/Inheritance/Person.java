package Inheritance;

public class Person {
	private String name;
	private Integer age;
	
	public Person() {
		System.out.println("Person class (Super class) constructor called.");
		System.out.println("Person class hashcode : " + this.hashCode());
		System.out.println("Person class name : " + this.getClass().getName());
	}
	
	public Person(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	//Overriding the equals method from object class
	@Override
	public boolean equals(Object obj) {
		System.out.println("Invoked equals override : " + this.getName());
		
		//If both the references are pointing to the same address
		if(this == obj) {
			return true;
		}
		
		//Checks if the argument is of the same type as that of class
		if(obj == null || obj.getClass() != this.getClass()){
			return false;
		}
		
		//Cast the type of the Object
		Person person = (Person)obj;
		
		return(person.getName().equals(this.getName()) && (person.getAge() == this.getAge()));
	}

	@Override
	public int hashCode() {
		System.out.println("Invoked hashcode override : " + this.getName());
		return this.getAge();
	}
	
}
