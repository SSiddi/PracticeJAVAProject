package practice.test.program;

class A {
	void msg() {
		System.out.println("Hello");
	}
}

class B extends A {
	void msg() {
		System.out.println("Welcome");
	}
}

class C extends B {
	public static void main(String args[]) {
		A obj3 = new C();
		obj3.msg();
	}
}


// output is Welcome

/*
Here's why:

Class A has a method msg() that prints "Hello".
Class B extends class A and overrides the msg() method to print "Welcome".
Class C extends class B.
In the main() method of class C, an object of class C is created and assigned to a reference of type A.
When msg() is called on this object, it invokes the overridden method msg() from class B, printing "Welcome". */