package Ejercicios_complementarios1;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num1, num2;
		System.out.println("Ingrese el primer numero");
		num1 = scan.nextInt();
		System.out.println("Ingrese el segundo numero");
		num2 = scan.nextInt();
		scan.close();
		System.out.println("El resultado de la multiplicación es: "+(num1*num2));
		

	}

}
