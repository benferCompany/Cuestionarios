package Ejercicios_complementarios1;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num1;
		int resultado=1;
		
		num1 = scan.nextInt();
		scan.close();;
		
		for(int i=0;i<num1;i++) {
			resultado *= num1;
			System.out.println(resultado);
		}

	}

}
