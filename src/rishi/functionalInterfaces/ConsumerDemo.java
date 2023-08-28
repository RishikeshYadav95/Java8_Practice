package rishi.functionalInterfaces;

import java.util.function.Consumer;

//Traditional method of implementing Consumer functional interface. 
class ConsumerImpl implements Consumer<String>{

	@Override
	public void accept(String t) {
		System.out.println(t);		
	}
}

public class ConsumerDemo {
	
	public static void main(String[] args) {
		
		//Traditional implementation.
		Consumer<String> consumer = new ConsumerImpl();
		consumer.accept("Hello WOrld");
		
		//Using Lambda Expressions
		Consumer<String> consumer1 = (a) -> {System.out.println(a);};
		consumer1.accept("HelloWorld!");
	}
}
