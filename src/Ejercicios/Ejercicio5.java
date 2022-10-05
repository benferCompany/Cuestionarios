package Ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int continuar = 1;
		
		while(continuar ==1) {
			System.out.println("Ingrese algún número para saber su correpondiente tabla.");
			int nro = scan.nextInt();
			
			
			
			for(int i=1; i <= 10; i++) {
				System.out.println(nro+" * " + i + " = "+nro*i);
			}
			
			System.out.println("Si desea saber otra tabla igrese 1, de lo contrario ingrese otro número.");
			continuar = scan.nextInt();
			
		}
		scan.close();
		
	}

}
