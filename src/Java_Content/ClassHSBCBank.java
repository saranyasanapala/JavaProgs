package Java_Content;

public class ClassHSBCBank implements USBankInterface,BrezilBankInterface {

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
