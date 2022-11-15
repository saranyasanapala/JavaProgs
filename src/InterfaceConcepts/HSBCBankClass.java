package InterfaceConcepts;

public class HSBCBankClass implements USBankInterface, BrezilBankInterface {
	// we are achieving multiple inheritance
	// is -A relation when a class implements interface
	// Has- a relation when a class extends another class
	// If a class is implementing an interface then it's mandatory to define
	// overridden methods of interface

	@Override
	public void credit() {
		// TODO Auto-generated method stub
		System.out.println("USBanKInterface Override---Credit");

	}

	@Override
	public void debit() {
		// TODO Auto-generated method stub
		System.out.println("USBanKInterface Override---debit");
	}

	@Override
	public void transfermoney() {
		// TODO Auto-generated method stub
		System.out.println("USBanKInterface Override---transferMoney");
	}

	@Override
	public void mutuvalfund() {
		// TODO Auto-generated method stub
		System.out.println("BrazelBAnkInterface Override---transferMoney");
	}

	public void EducationalLoan() {
		// TODO Auto-generated method stub
		System.out.println("HSBCClass ---EducationalLoan");
	}

	public void carLoan() {
		// TODO Auto-generated method stub
		System.out.println("HSBCClass ---carLoan");
	}

}
