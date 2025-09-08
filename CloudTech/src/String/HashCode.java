package String;

public class HashCode {
	public static void main(String[] args) {
		String s1= "supritha";
		int hash1= s1.hashCode();
		String s2 = new String(s1);
		int hash2= s2.hashCode();
		System.out.println(hash1+" "+hash2);
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		s2="suman";
		String s3= new String("Suman");
		System.out.println(s2.hashCode()+" "+s3.hashCode());
		
		
		}

}
