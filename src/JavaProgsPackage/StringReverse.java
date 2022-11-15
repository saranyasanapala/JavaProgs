package JavaProgsPackage;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		StringBuffer sb=new StringBuffer("Saranya");
		System.out.println(sb);
		System.out.println("Reverse String ------->"+sb.reverse());
		
		String s=new String("Saranya is a Software engineer");
		char ch[]=s.toCharArray();
		String strev = "";
		System.out.println(ch);
		for(int i=ch.length-1;i>=0;i--) {
				//System.out.print(ch[i]);
				strev=strev+ch[i];
				}
		System.out.println(strev);
		char[] ch1=strev.toCharArray();
		System.out.println(ch1);
		for(int i=0;i<=ch1.length-1;i++) {
			//System.out.print(ch1[i]);
			if(ch1[i]!=' ') {
				System.out.print(ch1[i]);
				}
			
			}
		System.out.println(ch1);
	}

}
