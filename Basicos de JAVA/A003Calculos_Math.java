import java.util.Scanner;
public class A003Calculos_Math {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double raiz, numero;
		float num1;
		int resultado=0;
		System.out.println("Ingresa un numero del cual calcular la raiz cuadrada:");
		numero= entrada.nextFloat();
		raiz=Math.sqrt(numero);  //Hallar la raiz cuadrada de un numero
		System.out.println("La raiz cuadrada de "+numero+" Es igual a "+raiz);
		System.out.println("Ingresa un numero decimal que quiera redondear:");
		num1= entrada.nextFloat();
		resultado=Math.round(num1);  //redonde un numero dado por el usuario
		System.out.println("El redondeo de "+num1+" Es igual a "+resultado);
		
	
	}

}
