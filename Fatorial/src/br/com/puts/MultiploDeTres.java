package br.com.puts;

public class MultiploDeTres {
	public static void main(String[] args) {
		// imprimir todos os múltiplos de 3, de 1 a 100.

		int i;
		for (i = 1; i <= 102; i++) {
			if (i % 3 == 0) {
				System.out.print(i);
			}else if(i%3 == 1){
				System.out.print(", ");
			}
		}
	}
}
