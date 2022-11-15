package EncapsulationConcept;

public class EmpData   {
	private int EmpAge;
	private String EmpName;
	private int EmpSSN;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmpData ed=new EmpData();
		ed.setEmpAge(20);
		ed.setEmpName("Saranya");
		ed.setEmpSSN(1234567);
		System.out.println(ed.getEmpAge());
		System.out.println(ed.getEmpName());
		System.out.println(ed.getEmpSSN());
	}


	public int getEmpAge() {
		return EmpAge;
	}


	public void setEmpAge(int empAge) {
		this.EmpAge = empAge;
	}


	public String getEmpName() {
		return EmpName;
	}


	public void setEmpName(String empName) {
		this.EmpName = empName;
	}


	public int getEmpSSN() {
		return EmpSSN;
	}


	public void setEmpSSN(int empSSN) {
		this.EmpSSN = empSSN;
	}

}
