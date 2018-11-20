package practicas;

import java.util.Scanner;

public class algoritmo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Algoritmo que lea dos numeros, calculando y escribiendo el valor
		 * de su suma, resta, roducto y division.
		 */
		
		int a;
		int b;
		int s;
		int r;
		int p;
		int d;
		
		
		Scanner primer=new Scanner(System.in);
		System.out.println("Ingrese primer numero :");
		a=primer.nextInt();
		
		Scanner segundo=new Scanner(System.in);
		System.out.println("Ingrese segundo numero :");
		b=segundo.nextInt();
		
		s = a+b;
		System.out.println("LA SUMA DE LOS UNMEROS ES "+s);
		
		r = a-b;
		System.out.println("LA RESTA DE LOS NUMEROS ES "+r);
		
		p = a*b;
		System.out.println("EL PRODUCTO ENTRE LOS NUMEROS ES "+p);
		if (b==0) {
			System.out.println("NO SE PUEDE DIVIDIR POR 0");
		}
			else {
				d = a/b;
				System.out.println("EL CUOCIENTE ENTRE LOS NUMEROS ES "+d);
		}
		
		
	}

}
