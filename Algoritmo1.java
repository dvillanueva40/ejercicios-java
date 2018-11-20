package ejercicios;

import java.util.Scanner;

public class Algoritmo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Realizar 5 ejercicios de cada guia en java
		
		// Ejercicio Algoritmo1
		
		
		int a;
		int b;
		int aux;
		
		Scanner nombre= new Scanner(System.in);
		System.out.println("ingrese el primer numero a: ");
		a=nombre.nextInt();
		Scanner nombre2 = new Scanner(System.in);
		System.out.println("ingrese el segundo numero b: ");
		b=nombre2.nextInt();
		
		aux=a;
		a=b;
		b=aux;
		
		System.out.println("el valor de a es : "+a);
		System.out.println("el valor de b es: "+b);
	
		nombre.close();
		nombre2.close();
	}
}



