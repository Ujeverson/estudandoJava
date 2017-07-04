package br.com.puts;

public class SomaDeUmAMil {
	public static void main(String[] args) {
		int x = 0;
		int i;
		int n = 100;
		for (i = 1; i <= n; i++) {
			x = x + i;
			System.out.print(i);
			
			if (i == n){
				System.out.print(" = ");
			}else{
				System.out.print(" + ");
			}

		}System.out.print(x);

	}

}
