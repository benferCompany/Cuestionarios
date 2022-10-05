package Ejercicios_complementarios1;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		int numero;
		int factoreo=1;
		Scanner scan = new Scanner(System.in);
			numero=scan.nextInt();
		scan.close();
		
		for(int i =1; i<=numero; i++) {
			factoreo =factoreo*i;
			System.out.println(factoreo);
		}
		
		

	}

}
