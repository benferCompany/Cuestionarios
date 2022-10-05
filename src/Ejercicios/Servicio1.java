package Ejercicios;

public class Servicio1 {
	private static String bienvenida = "Bienvenidos";
	public static void main(String[] args) {
		
		System.out.println(bienvenida);
		String hola= "hola";
		
		imprimirTextoXVoces(hola,3);
	}
	
	public static void imprimirTextoXVoces(String texto,int contador) {
		for (int i=0;i<contador ; i++) {
			System.out.println(texto);
		}
	}

}
