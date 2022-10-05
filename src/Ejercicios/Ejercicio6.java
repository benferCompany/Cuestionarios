package Ejercicios;
import java.util.Scanner;
public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		int contiunar = 1;
		try {
			do {
				int nro;
				while(contiunar ==1) {
					System.out.println("Por favor, Ingrese un número: ");
					nro = scan.nextInt();
					System.out.println("El numero ingresado es: "+nro);
					
					System.out.println("Si desea continuar presione 1, sino  cualquier otro número.");
					contiunar = scan.nextInt();
				}
				
			}while(contiunar == 1);
			scan.close();
		}catch(Exception e){
			System.out.println("Error: Por favor ingrese un dato de tipo número.");
		}
		

	}

}
