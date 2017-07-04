package br.com.puts;

public class FatorialUm {
	public static void main(String[] args) {
		int fatorial = 1;
		for (int n = 1; n<=10; n++){
			fatorial = n*fatorial;
			System.out.println("O fatorial de "+n+" é "+n+"! = "+fatorial);
		}//verificar a alteração.
	}

}
