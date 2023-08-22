package rishi.functionalInterfaces;

import java.util.Scanner;

@FunctionalInterface
interface Shape {
	
	void area();
}

public class FunctionalInterfaceWIithLambdaExample {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Select shape (1:Rectangle, 2:Square): ");
		int choice = sc.nextInt();
		if(choice == 1) {
			Shape rectangle = () -> {
				System.out.print("Length of rectangle: ");
				int a = sc.nextInt();
				System.out.print("Width of rectangle: ");
				int b = sc.nextInt();
				System.out.println("Area of rectangle: "+a*b);
			};
			rectangle.area();
		}
		else if(choice == 2) {
			Shape square = () -> {
				System.out.print("Length of square: ");
				int a = sc.nextInt();
				System.out.println("Area of square: "+a*a);
			};
			square.area();
		}
	}

}
