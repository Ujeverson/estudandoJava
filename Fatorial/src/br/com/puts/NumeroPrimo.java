package br.com.puts;

import java.util.Scanner;

public class NumeroPrimo {

	public static void main (String args[]) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Informe um n�mero inteiro:");
		int n = ler.nextInt();

		boolean primo = true;

		int i = 2;
		while ((primo == true) && (i <= (n / 2))) {
			if ((n % i) == 0)
				primo = false; // encontrou um divisor, portanto, n�o eh primo
			else
				i++; // pr�ximo divisor
		}

		System.out.println();

		if (primo == true)
			System.out.println(n + " � um numero primo.");
		else
			System.out.println(n + " n�o � um numero primo.");
	}
}
