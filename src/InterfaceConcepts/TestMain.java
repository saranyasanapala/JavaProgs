package InterfaceConcepts;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HSBCBankClass chb = new HSBCBankClass();//Static polymorphism
		chb.carLoan();
		chb.credit();
		chb.debit();
		chb.EducationalLoan();
		chb.mutuvalfund();
		chb.transfermoney();
		System.out.println("----------------------------");
		USBankInterface chb1 = new HSBCBankClass();//Dynamic polymorphism
		//Child class object can be reffered by parent class reference variable.
		//only override methods can call
		chb1.credit();
		chb1.debit();
		chb1.transfermoney();

	}

}
