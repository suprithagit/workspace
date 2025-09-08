package java8methodRef;
//Example for method Reference
public class MainAccount {
	public static void main(String[] args) {
		//Static Reference
		//functional interface = className::methodName
		AccountCreation account1= Account::createAccount;
		account1.needAccount();
		
		//Instance reference
		//create object
		//functional interface = objectName::methodName
		Account person1= new Account();
		AccountCreation createAccount = person1::ceateNewAccount;
		createAccount.needAccount();
		
		//public int accountCreated(int accountNumber ) ==>provides error
		//Limitation : return type can be anything but method parameters should match
		AccountCreation accountCreation = person1::accountCreated; 
		accountCreation.needAccount();
		
		//Constructor Reference using Lambda
		 StudentProvider provider= ()->{
			return new StudentAccount();
		 };
		 provider.getAccount();
		 
		 //using ::
		 //Interface interface = Class name :: new Keyword 
		 StudentProvider p1= StudentAccount::new;
		 p1.getAccount();
	}

}
