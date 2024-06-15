package practice.test.program;

// Java program to demonstrate the calling of
// Static block in java
import java.util.*;

public class TestStaticBlock {

	// Static variable
	private static List<String> list;

	// Constructor of this class
	TestStaticBlock() {
		list.add("five");
		list.add("six");
	}

	// Method of this class
	public void printList() {
		System.out.println(list);
	}

	// static block
	static {
		list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
	}

	// main method
	public static void main(String[] args) {

		// Calling of constructor inside main()
		TestStaticBlock obj = new TestStaticBlock();

		// Calling of method inside main()
		obj.printList();

		// Calling of the static block
		// Nothing to do here as it is called
		// automatically as class is loaded in memory

	}
}

// we don't need to call the static block manually,
// rather it is executed automatically at the very beginning whenever the class is loaded in the memory.
// The static block is executed by default during the loading of the class and it is executed only once.
// non static fields cannont be used inside static block, error will be shown
// Order of Execution of Multiple Static Blocks in Java:
// In a java program, a class can have multiple static initialization blocks that will execute in the same order they appear in the program, 
// that is, the order for the execution of static block in a class will be from top to bottom.
// In JDK version 1.5 or later it is not possible to execute a static block without a main method inside the class.
// static block should not be in main method becz it is called on class load