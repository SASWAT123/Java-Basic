package Comparable;

public class Student implements Comparable<Student>{
	
	private Integer studentId;
	private String studentName;
	private Integer studentAge;

	public Student(Integer studentId, String studentName, Integer studentAge) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAge = studentAge;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Integer getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(Integer studentAge) {
		this.studentAge = studentAge;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAge=" + studentAge + "]";
	}

	@Override
	public int compareTo(Student s) {
		if(this.studentAge > s.studentAge)
			return 1;
		else if(this.studentAge < s.studentAge)
			return -1;
		else return 0;
	}

}
