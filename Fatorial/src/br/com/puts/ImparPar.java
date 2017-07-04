package br.com.puts;

import java.util.Scanner;

public class ImparPar {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int x;

		System.out.println("Digite um número: ");

		x = entrada.nextInt();

		while (x > 1) {
			if (x % 2 == 0) {
				x = x / 2;

			} else if (x % 2 == 1) {
				x = 3 * x + 1;
			}
			System.out.print(x + "->");
		}

	}
}
