package br.com.puts;

import java.util.Scanner;

public class DivisoresDeUmNumero {

	public static void main(String[] args) {

		Scanner numero = new Scanner(System.in);
		System.out.println("Digite um número natural: ");

		int x;

		x = numero.nextInt();

		for (int i = 1; i <= x+1; i++) {
			if (x % i == 0) {
				System.out.print(i + ", ");
			}
		}

	}

}
