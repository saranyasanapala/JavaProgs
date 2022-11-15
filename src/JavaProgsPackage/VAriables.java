package JavaProgsPackage;

public class VAriables {
int a;
{
	int c=5;
System.out.println("instance block"+c);
}
static {
	int d=5;
	System.out.println("static block"+d);
	
}
public void m1() {
	System.out.println("instance method"+a);
	
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b;
		//VAriables v=new VAriables();
		//System.out.println(b);
//System.out.println(v.a);
//v.m1();
	}

}
