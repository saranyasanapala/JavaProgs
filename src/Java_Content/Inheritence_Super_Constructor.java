package Java_Content;



class HaiOne {
	int a = 99;

	public void m1() {
		System.out.println("Hai-parent method" + a);
		 //HelloOne hee = new HelloOne();
		//
		//hee.m1();
		// System.out.println("Hai-parent method" + hee.b);
	}
	HaiOne(){
		System.out.println("HAi-Parent-Constructor");
	}

	{
		System.out.println("instance block-Hai-parent");
	}
	static {
		System.out.println("static block-Hai-Parent");
	}
	
}

class HelloOne extends Hai {
	int b = 88;

	public void m1() {
		System.out.println("Hello-child method" + a);
		System.out.println("Hello-child method" + b);
	}

	{
		System.out.println("instance block-Hello-Child");
	}
	static {
		System.out.println("static block-Hello-child");
	}
	HelloOne(){
		System.out.println("Hello-child-Constructor");
	}
}

public class Inheritence_Super_Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Hai hai = new Hai();
//	System.out.println("------------------------------");
	HelloOne hello = new HelloOne();
//		System.out.println("----------------------");
//	Hai he = new Hello();
//		System.out.println("----------------------------");
//		hello.m2();
	hello.m1();
		
		
		
	}

}
