package br.com.puts;

public class SomaPA {
	public static void main(String[] args) {

		int a1 = 7;
		int r = 13;
		int n = 4;
		int pa;

		for (int i = 1; i <= n; i++) {
			a1 = a1 + r;
			if (i == 1) {
				a1 = 7;
			} 

			System.out.print(a1 + " + ");

		}
	}
}
