package Java_Content;

import java.util.Scanner;
class student{
	int i;
	String S;
	
	public void m1() {
		System.out.println(i+"    "+S);
	}
	
	public student() {
		System.out.println("Student-default_Constructor");
	}
	public student(int i,String S) {
		// TODO Auto-generated constructor stub
		
		this.i=i;
		this.S=S;
		System.out.println("Student-2 Arg_Constructor--->"+this.i+"    "+this.S);
		
		
	}
}


public class ConstructorOverloading {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//B b=new B();
		
		student s=new student();
		
		student sOneArg=new student(20,"Saranya");
		sOneArg.m1();
		
		
		
	
		
		

	}

}
