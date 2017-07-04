package br.com.puts;

public class FatorialUm {
	public static void main(String[] args) {
		long fatorial = 1;
		int x = 20;
		for (int n = 1; n <= x; n++) {
			fatorial = n * fatorial;
			System.out.println("O fatorial de " + n + " é " + n + "! = " + fatorial);
		}
	}

}
