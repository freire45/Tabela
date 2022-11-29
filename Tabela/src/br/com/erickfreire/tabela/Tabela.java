package br.com.erickfreire.tabela;

public class Tabela {

	public static void main(String[] args) {
		
		int i = 1;
		
		System.out.println("N	10*N	100*N	1000*N\n");
		
		while(i <= 5) {
			System.out.printf("%d	%d	%d	%d%n", i , i * 10, i * 100, i * 1000);			
			
			i++;
		}
		
	}

}
