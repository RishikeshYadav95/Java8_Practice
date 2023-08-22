package rishi.lambdaExpressions;

interface Addable{
	int addition(int a, int b);
}

class AddableImpl implements Addable{

	@Override
	public int addition(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}
	
}

public class LambdaParameter {
	
	public static void main(String[] args) {
		
		Addable addition = (a, b) -> {return a+b;};
		System.out.println(addition.addition(4, 5));
		Addable subtraction = (a, b) -> {
			if(a>b) 
			{
				return a-b;
			}
			return b-a;
		};
		System.out.println(subtraction.addition(2, 7));
	}
}
