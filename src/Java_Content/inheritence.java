package Java_Content;

class Hai {
	static int a = 99;
	int c = 22;

	static void m1() {
		System.out.println("Hai-parent Static method");
		// Hello hee = new Hello();
		// System.out.println("Hai-parent method" + hee.b);
	}

	public void m2() {
		System.out.println("Hai-parent instance method");
		// System.out.println("Hello-child method m2" + b);
	}

	Hai() {
		System.out.println("HAi-Parent-Constructor");
	}

	{
		System.out.println("instance block-Hai-parent");
	}
	static {
		System.out.println("static block-Hai-Parent");
	}

}

class Hello extends Hai {
	static int a = 88;
	int c = 33;

	static void m1() {
		System.out.println("Hello-child static method m1");

	}

	public void m2() {
		System.out.println("Hello-child instance method m2" + a);

	}

	{
		System.out.println("instance block-Hello-Child");
	}
	static {
		System.out.println("static block-Hello-child");
	}

	Hello() {
		System.out.println("Hello-child-Constructor");
	}
}

public class inheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Hello hello = new Hello();
		//System.out.println("------------------------------");

		/*
		 * Hai hai = new Hai();
		 * 
		 * Hai he = new Hello();//child class object is reffering to parent class
		 * reference variable-->RuntimePolimorphism
		 * System.out.println("----------------------");
		 * 
		 * hello.m1(); hai.m1(); System.out.println("----------------------------");
		 * he.m1(); // he.m2();//this is not possible because child class override
		 * methods only accessible by parent when there is dynamic dispatch
		 */
		//System.out.println(hello.c);
		//Hai hai = new Hai();
		//System.out.println(hai.c);
		Hai dypoli = new Hello();
		System.out.println(dypoli.c);
		System.out.println(dypoli.a);
		dypoli.m1();
		dypoli.m2();
		
		

	}

}
