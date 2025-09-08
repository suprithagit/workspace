package interfacesClass;

/*
 * Default Method
 * 
 */
public class FunctionalInter {
public static void main(String[] args) {
	RBI sbi=new SBI();
	sbi.deposit();
	sbi.withdraw();
	sbi.adharCard();
	
	RBI axis = new Axis();
	axis.deposit();
	axis.withdraw();
	axis.adharCard();
}
}
