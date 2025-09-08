package demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Integer[] array = {3, -2, 0, 7, 5, -8, 1, -1};
		List<Integer> al=new ArrayList<>();
		for(int i=0; i<=array.length-1;i++) {
			if(array[i]>0)
				al.add(array[i]);
			//System.out.println(array[i]);
		}
		Integer re=al.stream().reduce(Integer::min).get();
		System.out.println(re);
		
		String s1="MDAM";
		StringBuffer s2= new StringBuffer(s1);
		StringBuffer rev=new StringBuffer(s2).reverse();
		String result =s1.toString().equals(rev.toString())?"Palyndrome":"NotPalindrome";
	    System.out.println(result);
	
	   java.util.Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the string :");
	   String str=sc.next();
	   System.out.println(str);
	   
	   StringBuffer str1=new StringBuffer();
	   for(int i=str.length()-1;i>=0;i--) {
		   str1=str1.append(str.charAt(i));
	   }
	   String strresult =str.toString().equals(str1.toString())?"Palyndrome":"NotPalindrome";
	   System.out.println(strresult);
	   
	   //Reverse String using array
	   String l="MAVA";
	   char[] ch=l.toCharArray();
	   char[] rs = new char[ch.length];
	   System.out.println(ch);
	   
	   
	   for (int i = 0; i < ch.length; i++) {
           rs[i] = ch[ch.length - 1 - i]; // Copy characters in reverse order
       }
	   
//	   for(int i=ch.length-1;i>=0;i--) {
//		 System.out.println(ch[i]);
//	}
		   String chres=new String(rs);
		   System.out.println(chres);
	}
	
}
