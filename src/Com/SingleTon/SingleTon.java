package Com.SingleTon;

public class SingleTon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		private static SingleTon singleTon_instance = null;
		public String str;
		
        private SingleTon() {
        	str="Hey, i am using singleTon class";
        }
	}

}
