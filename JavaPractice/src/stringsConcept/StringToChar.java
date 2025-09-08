package stringsConcept;

import java.util.ArrayList;
import java.util.List;

public class StringToChar {
	public static void main(String[] args) {
	 String str="Hi I'm am mohan, I love singing, dancing, painting, and acting. Many people likes me. I am Like a celebraty";
	 String s1="Surya Mohan";
	 
	 char ch[]	= s1.toCharArray();
	 List ls=new ArrayList<>();
	 for(int i=0;i<=ch.length-1;i++) {
		 ls.add(ch[i]);
	 }
	 System.out.println(ls);
	}

}
