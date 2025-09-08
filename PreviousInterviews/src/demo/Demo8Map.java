package demo;

import java.util.function.DoublePredicate;
import java.util.function.Predicate;
import java.util.stream.DoubleStream;

public class Demo8Map {

	public static void main(String[] args) {
		Simpleadd addition=Integer::sum;
		int res=addition.adding(50,60);
		System.out.println("Result:"+res);
		
		DoublePredicate Even = value -> value % 2 == 0;  
        DoubleStream.of(11.0, 12.0, 13.0, 14.0, 15.0, 16.0, 17.0, 18.0, 19.0, 20.0) .filter(Even)   
        .forEach(value -> System.out.println("The Even number is : " + value));  
        
        
	}
}
