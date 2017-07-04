package br.com.puts;

public class QuaseBinomio {
	
	public static void main(String[] args) {
		
		int x = 10;
		
		for(int i = 1; i<=x; i++){
			for(int j = 1; j<=i; j++){
				int a = i*j;
				System.out.print(a+" ");
			}System.out.println(" ");
		}
	}

}
