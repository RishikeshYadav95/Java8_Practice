package rishi.lambdaExpressions;

class ThreadDemo implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Run method called....");
	}
	
}

public class RunnableLambdaExample {
	
	public static void main(String[] args) throws InterruptedException {
		Thread thread = new Thread(new ThreadDemo());
		thread.start();
		System.out.println(thread.getState());
		System.out.println(thread.getState());
		System.out.println(thread.getState());
		thread.stop();
		
		Thread threadLambda = new Thread(() -> {
			System.out.println("Run method called....from lambda function");
			System.out.println("Lambda functions can be used to call threads");
			});
		threadLambda.start();
	}
}
