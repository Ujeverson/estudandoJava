package br.com.puts;

public class NumeroPrimo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 30;
		
		double resultado;
		int n = x+2;
		boolean primo = false;
		
		for(int i=2; i < n; i++){
			resultado = x/i;
			if(resultado<=i)
				System.out.println(resultado);
		}
		
		//System.out.println("É primo: "+primo);
	}

}
