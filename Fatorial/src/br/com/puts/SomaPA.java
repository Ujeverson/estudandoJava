package br.com.puts;

public class SomaPA {
	public static void main(String[] args) {

		int a1 = 7;
		int r = 13;
		int n = 4;
		int soma;

		soma = ((2 * a1 + (n - 1) * r) * n) / 2;

		for (int i = 0; i < n; i++) {
			System.out.print(a1);
			if((n-1) != i)
				System.out.print(" + ");

			a1 += r;
		}
		System.out.print(" = "+soma);
	}
	
}
