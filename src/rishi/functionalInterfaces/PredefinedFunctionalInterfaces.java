package rishi.functionalInterfaces;

import java.util.function.Function;

public class PredefinedFunctionalInterfaces {
	
	public static void main(String[] args) {
		
		Function<String, Integer> function1 = (String s) -> {
			return s.length();
		};
		//YOu can also write the above code as 
		//Function<String, Integer> function1 = (String s) -> s.length();
		//Java compiler is smart enough to understand that when there is only one statement, it is the return statement.
		
		System.out.println(function1.apply("Rishikesh"));
	}

}
