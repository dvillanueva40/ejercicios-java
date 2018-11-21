package ejercicios;

import java.util.Scanner;

public class Algoritmo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Realizar 5 ejercicios de cada guia en java
		
		// Ejercicio Algoritmo1, cambia el valor de a por el vaor de b
		
		
		int a;
		int b;
		int aux;
		
		Scanner variable= new Scanner(System.in);
		System.out.println("ingrese el primer numero a: ");
		a=variable.nextInt();
		System.out.println("ingrese el segundo numero b: ");
		b=variable.nextInt();
		
		aux=a;
		a=b;
		b=aux;
		
		System.out.println("el valor de a es : "+a);
		System.out.println("el valor de b es: "+b);
	
		nombre.close();
		nombre2.close();
	}
}



