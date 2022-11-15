package Java_Content;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ClassHSBCBank chb=new ClassHSBCBank();
chb.carLoan();
chb.credit();
chb.debit();
chb.EducationalLoan();
chb.mutuvalfund();
chb.transfermoney();
System.out.println("----------------------------");
USBankInterface chb1=new ClassHSBCBank();
chb1.credit();
chb1.debit();
chb1.transfermoney();

	}

}
