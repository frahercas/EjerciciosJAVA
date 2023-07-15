
public class A002Declaraciones_Operadores {

	public static void main(String[] args) {
		int a=5, b=7;
		System.out.println("OPERADORES ARITMETICOS");
		int suma=a+b;        //Operador suma
		int resta=a-b;	     //Operador Resta
		int multiplicacion= a*b;	//Operador multiplicacion
		float x=7,y=2;
		float division= x/y; 	        //Operador division
		System.out.println("suma igual a "+suma);
		System.out.println("resta igual a "+resta);
		System.out.println("multiplicacion igual a "+multiplicacion);
		System.out.println("division igual a "+division);        //En estos ejemplos concatenamos una cadena de caracteres con el valor de una variable
		
		System.out.println("OPERADORES incremento y decremento");
		int numero= 100;
		int valo1= ++numero; //Operador incremento
		int valo2= --numero; //Operador Decremento
		System.out.println("el valor inicial es "+numero+" y es valor incrementado en uno es "+ valo1);
		System.out.println("el valor inicial es "+numero+" y es valor decrementado en uno es "+ --numero);
	
		System.out.println("DECLARACION DE CONSTANTES");
		final double pulgadas=2.54; //Declaracion de una constante propia
		double cm=6;
		double result= cm/pulgadas;
		System.out.println("En "+cm+" centimetros hay "+result+" pulgadas");
	
	}

}
