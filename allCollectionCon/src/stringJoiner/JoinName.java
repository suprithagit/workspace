package stringJoiner;

import java.util.StringJoiner;

public class JoinName {
	public static void main(String[] args) {
		StringJoiner js= new StringJoiner(","); //Delimiter - Special symbols
		js.add("padma");
		js.add("Kavita");
		System.out.println(js);
		
		//String Joiner with delimiter==>symbol, prefix==> startsWith , Suffix=>Ends with
		StringJoiner j1= new StringJoiner(" & ", "{", "}"); 
		j1.add("Manish");
		j1.add("Rushi");
		System.out.println(j1);
		
		//merge operation
		StringJoiner merge=js.merge(j1);
		System.out.println(merge);
		 
	}
}
