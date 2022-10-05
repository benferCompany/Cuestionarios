package Ejercicios_complementarios1;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		String cadena;
		char caracter;
		int contador=0;
		Scanner scan = new Scanner(System.in);
			System.out.println("Ingrese la cadena de texto.");
			cadena = scan.nextLine();
			System.out.println("Ingrese el caracter que deasea contar.");
			caracter = scan.next().charAt(0);
		scan.close();
		
		for(int i = 0;i<cadena.length();i++) {
			
			if(caracter==cadena.charAt(i)) {
				contador++;
				
			}
		}
		System.out.println(contador);
	}
	

}
