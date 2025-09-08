package interfacesClass;

public interface RBI {
//abstract methods
	void withdraw();

	void deposit();

//default method should have body
	public default void adharCard() {
		System.out.println("Customer shound link Adhar");
	}
}

class SBI implements RBI {

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		System.out.println("SBI withdraw");

	}

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("SBI deposit");
	}

	@Override
	public void adharCard() {
		// TODO Auto-generated method stub
		RBI.super.adharCard();
		System.out.println("Your account is linked with adhar");
	}

}

class Axis implements RBI {

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		System.out.println("Axis withdraw");
	}

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("Axis Deposit");
	}

}