package br.com.puts;

public class Fibonacci {
	public static void main(String[] args) {
		int a = 0;
		int nElementos = 6;
		int x = 1;
		for (int i = 1; i <= nElementos; i++) {
			x = x + a;
			a = x - a;
			if (i == 1) {
				System.out.print("1, ");
			}
			System.out.print(x + ", ");

		}
	}

}
