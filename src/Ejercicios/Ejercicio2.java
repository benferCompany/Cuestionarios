package Ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int continuar = 1;
			while(continuar ==1) {
				System.out.println("Igrese el primer numero.");
				int a = scanner.nextInt();
				System.out.println("Igrese el segundo número.");
				int b = scanner.nextInt();
				System.out.println("Igrese el tercer número.");
				int c = scanner.nextInt();
				
				System.out.println("El primer nro ingresado es: "+a);
				System.out.println("El segundo nro ingresado es: "+b);
				System.out.println("El tercer nro ingresado es: "+c);
				
				System.out.println("Si desea continuar ingrese 1, de lo contrario ingrese cualquier otro número.");
				
				continuar = scanner.nextInt();
				
				if(continuar !=1) {
					System.out.println("Finalizado....");
				}
				
			}
			scanner.close();
			
		}
		catch (Exception e) {
			System.out.println("Error: Ingresaste un dato invalido. Recorda que solo recibe dato de tipo número.");
			
		}{
			
		}

	}

}
