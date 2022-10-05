package Ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		try {
			int continuar =1;
			while(continuar ==1) {
				int nota = scan.nextInt();
				
				
				if( nota> 92) {
					System.out.println("Excelente");
				}else if(nota>84) {
					System.out.println("Sobresaliente");
				}else if(nota>74) {
					System.out.println("Distinguido");
				}else if(nota>59) {
					System.out.println("Bueno");
				}else{
					System.out.println("Desaprobado");
				}
				System.out.println("Presione 1 si desea ingresar otra calificación, de lo contrario ingrese otro número.");
				continuar = scan.nextInt();
				if(continuar !=1) {
					System.out.println("Finalizado...");
				}
			}
			scan.close();
			

		} catch (Exception e) {
			System.out.println("Error al ingresar calificación. Recuerde que debe ser un dato de tipo número.");
		}
				

	}

}
