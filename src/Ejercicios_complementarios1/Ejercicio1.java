package Ejercicios_complementarios1;
import java.util.Scanner;
public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String usuario;
		
		System.out.println("Por favor ingrese su nombre de usuario sin espacios");
		usuario = scan.next();
		scan.close();
		System.out.println("Hola "+usuario);
	}

}
