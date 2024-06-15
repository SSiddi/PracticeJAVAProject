package practice.test.program;


class constructorChaining {
	constructorChaining() {
	        System.out.println("Superclass constructor");
	    }
	}

	class SubClass extends constructorChaining {
	    SubClass() {
	        super(); // Implicit call to the superclass constructor
	        System.out.println("Subclass constructor");
	    }
	}
	

	// output 
	// Superclass constructor
	// Subclass constructor
	
	
/*	
	Here's the explanation:

	The superclass constructor prints "Superclass constructor" when an instance of constructorChaining is created.
	When an instance of SubClass is created, it implicitly calls the superclass constructor, printing "Superclass constructor".
	Then, the subclass constructor is executed, printing "Subclass constructor".
	
	*/