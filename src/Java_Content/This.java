package Java_Content;
 
class Parent{
	String s="Parent Class Variable";
	
}
 
class child extends Parent {
	String s="Child Class variable";
	 public void m1() {
		 String s="method inside child";
		 System.out.println(s); 
		 child c1=new child();
		 System.out.println(this.s);
		 
		 System.out.println(super.s);
		 
	 }
}
public class This{

	 public static void main(String[] args) {
	// TODO Auto-generated method stub
		 child c=new child();
		 c.m1();
		
	 
	 
 }
 }

