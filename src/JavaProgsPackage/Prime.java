package JavaProgsPackage;

public class Prime {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=63;
		
		
		
		int i,c=0;
		for(i=1;i<=n/2;i++) {
			if(n%i==0) {
				System.out.println("Factors"+i);
				c++;
				
			} 
			if(c==2)
				break;
			
		}
		System.out.println("No of factors"+c);
		if(c==1) {
			System.out.println("prime");
		}
		else
		System.out.println("not prime");
	}

}
