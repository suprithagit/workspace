package java8methodRef;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Account {

	public static void createAccount() {
	    LocalDateTime date	=LocalDateTime.now();
	    System.out.println(date);
		System.out.println("Provide adhar card copy");
		System.out.println("Provide pan card copy");
		System.out.println("Provide Phone number");
		System.out.println("Provide MailId");

	}
	
	public void ceateNewAccount() {
		System.out.println();
		System.out.println(" Your account creation is in process");
		LocalDate date= LocalDate.now();
		System.out.println(date);
	}
	
	public int accountCreated() {
		System.out.println();
	    int accountNumber = 124;
		System.out.println(" Your account number is :" + accountNumber);
		LocalDate date= LocalDate.now();
		System.out.println(date);
		return accountNumber;	
	}
}
