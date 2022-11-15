package JavaProgsPackage;

public class FebinoociSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f1=0,f2=1;
		int i,f3;
		System.out.print(f1+"    "+f2);
		for(i=0;i<=10;i++) {
			
			f3=f1+f2;
			f1=f2;
			f2=f3;
			
			System.out.print("   "+f3+"  ");
			if(f3==13) {
			break;
			}
		}
	


	}

}
