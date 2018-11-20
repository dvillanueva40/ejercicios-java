package practicas;

import java.util.Scanner;

public class algoritmofunciones1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*escribe una funcion que devuelva el resultado de un numero elevado
		 * a un exponente dado
		 */
		double b;
		double e;
		
		Scanner base=new Scanner(System.in);
		System.out.println("Ingrese Base: ");
		b=base.nextInt();
		
		Scanner exponente=new Scanner(System.in);
		System.out.println("Ingrese exponente: ");
		e=exponente.nextInt();
		
		double pow=Math.pow(b,e);
		System.out.println(b+" elevado a "+e+" = "+pow);
			
		}

	}


