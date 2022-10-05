package Ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		try {
			int continuar =1;
			
			while(continuar ==1) {
				System.out.println("Por favor ingrese un número correpondiente a un día de la semana.");
				int dia = scan.nextInt();
				
				switch(dia) {
					case 1:
						System.out.println("Domingo");
						break;
					
					case 2:
						System.out.println("Lunes");
						break;
					case 3:
						System.out.println("Martes");
						break;
					case 4:
						System.out.println("Miercoles");
						break;
					case 5:
						System.out.println("Jueves");
						break;
					case 6:
						System.out.println("Viernes");
						break;
					case 7:
						System.out.println("Sabado");
						break;
					default:
						System.out.println("Ese número no hace referencia a nigun día de la semana.");
						break;
				}
				
				System.out.println("Si desea saber otro día ingrese 1, de lo contrario ingrese cualquier otro número.");
				continuar = scan.nextInt();
				
				if(continuar !=1) {
					System.out.println("Finalizado...");
				}
			}
			scan.close();
						
		} catch (Exception e) {
			System.out.println("Error: Por favor ingrese un dato valido. Recuerde que debe ingresar un dato de tipo número.");
		}
	

	}

}
