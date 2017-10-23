package cwiczenia;

public class Main {
	
	private static int fib(int i) {
		if (i < 2) {
			return i;
		}
		else {
			return fib(i-1)+fib(i-2);
		}
	}
	
	public static void main(String[] args) {
		System.out.print(fib(10));
	}

}
