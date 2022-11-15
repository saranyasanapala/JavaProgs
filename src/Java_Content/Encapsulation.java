package Java_Content;

 

public class Encapsulation {
	 private int ssn;
	 private String empName;
	 private int empAge;
	// System.out.println(e.getEmpAge());
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsulation e=new Encapsulation();
		e.empAge=18;
		e.empName="Saranya";
		e.ssn=20202;
System.out.println(e.getEmpAge());
System.out.println(e.empName);
System.out.println(e.ssn);
	}


	public int getSsn() {
		
		return ssn;
		
	}


	public void setSsn(int ssn) {
		this.ssn = ssn;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public int getEmpAge() {
		return empAge;
	}


	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

}
