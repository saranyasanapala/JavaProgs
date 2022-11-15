package InterfaceConcepts;

public interface USBankInterface {
	// Only method decleraton
	// no method body only method prototype
	// in interface we can declare variables by default it is static in nature.
	// no static methods in interface.
	// No main method in interface
	// we can't create object of the interface
	// interface abstract in nature
	int min_Balance = 100;

	public void credit();

	public void debit();

	public void transfermoney();
}
