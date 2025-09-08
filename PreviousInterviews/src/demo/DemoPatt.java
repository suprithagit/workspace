package demo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DemoPatt {
	public static void main(String[] args) {
	
		//Fibonacci series f(n)=f(n-1)+f(n-2) 
		int n=20;
		int a=0;
		int b=1;
		
		List<Integer> l=new LinkedList<>();
		l.add(a);
		l.add(b);
		
		for(int i=2; i<=n;i++) {
			int k=l.get(i-1)+l.get(i-2);
			l.add(k);
		}     
System.out.println(l);
//output: 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181
}
}
