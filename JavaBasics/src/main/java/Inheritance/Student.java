package Inheritance;

public class Student extends Person{
	
	private Integer id;
	
	public Student() {
		
		System.out.println("Subclass constructor invoked"); 
        System.out.println("Sub class object hashcode :" + this.hashCode()); 
        System.out.println(this.hashCode() + "   " + super.hashCode()); 
        System.out.println(this.getClass().getName() + "  " + super.getClass().getName()); 
	}

	public Student(Integer id) {
		super();
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
}
