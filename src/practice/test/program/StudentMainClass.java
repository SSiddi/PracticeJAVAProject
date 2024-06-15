package practice.test.program;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentMainClass {

	public static void main (String args[])
	{
		List<Student> students = new ArrayList<>();
		
		students.add(new Student(23,"Rohan"));
		students.add(new Student(12, "Sohan"));
		students.add(new Student(44, "Sohan"));
		students.add(new Student(10, "Rohan"));
		students.add(new Student(2,"Preeti"));
		students.add(new Student(0,"Siya"));
		students.add(new Student(5,"Ram"));
		
		Collections.sort(students, new sortByNameThenMarks());
		for(Student student: students)
		{
			System.out.println(student);
		}
	}

}


 class sortByNameThenMarks implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		if(o1.name.equals(o2.name))
		{
			return o1.marks - o2.marks;
		}
		else return o1.name.compareTo(o2.name);
	
	}
	
}