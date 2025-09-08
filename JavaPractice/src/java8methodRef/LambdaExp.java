package java8methodRef;

public class LambdaExp {
	public static void main(String[] args) {
	System.out.println("---------We are Starting Execution----------");
	
		MethodUsage account1= ()->{
			System.out.println("I need an account");
		};
		
		account1.createAccount();
		
	System.out.println("-------Completed---------");
	
	}
}
