package practice.test.program;

public class Student  {

	String name;
	int marks;
	
	public Student(int marks, String name) {
		super();
		this.name= name;
		this.marks= marks;
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String toString()
	{
		return "student [marks= " + marks + ", name = " +name + "]";
		
	}
	
	public int compareTo(Student obj) {
	return this.marks-obj.marks;
	}

}
