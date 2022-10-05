package Ejercicios_complementarios1;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String nombre,apellido, ciudad;
		String direccion= "";
		int edad;
		
		
		
		
		
		
		
		System.out.println("Ingrese su nombre: ");
		nombre = scan.nextLine();
		System.out.println("Ingrese su apellido: ");
		apellido = scan.nextLine();
		System.out.println("Ingrese su edad: ");
		edad = scan.nextInt();
		
		// este scan.nextLine() Es para que no me saltee dirección....
		scan.nextLine();
		
		System.out.println("Ingrese su dirección: ");
		direccion = scan.nextLine();
		System.out.println("Ingrese su ciudad: ");
		ciudad = scan.nextLine();
		scan.close();
		
		
		System.out.println("Nombre y apellido: "+nombre+" "+apellido);
		System.out.println("Edad: "+edad);
		System.out.println("Dirección: "+direccion);
		System.out.println("Ciudad: "+ciudad);
		
		

	}

}
