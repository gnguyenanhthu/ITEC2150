package ch2b_2_inheritanceAndOverriding;

/**
 * Class: ClassB
 */
public class ClassB extends ClassA {
	private int n;

	public ClassB(int m, int n) {
		super(m);
        //super keyword is to invoke superclass' constructor. 
		//This statement super(m) invokes the ClassA's constructor
        //that matches the arguments and it must be the first statement
		//of the subclass' constructor as you see here.
        //this is the way to explicitly invoke a superclass constructor.
		this.n = n;
	}
	
	public String toString() {
		return "ClassB[" + super.getM() + "," + n + "]";
	}
}
