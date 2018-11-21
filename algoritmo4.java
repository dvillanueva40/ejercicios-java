package practicas;

import java.util.Scanner;

public class algoritmo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*algoritmo que lee tres numeros distintos
		 * y nos diga cual de ellos es el mayor
		 */
		
		int a;
		int b;
		int c;
		
		Scanner variable=new Scanner(System.in);
		System.out.println("ingrese a: ");
		a=variable.nextInt();
		System.out.println("ingrese b: ");
		b=variable.nextInt();
		System.out.println("ingrese c: ");
		c=variable.nextInt();
		if (a>b&&a>c) {
		System.out.println(a+" es el mayor");
		}
		if (b>c&&b>a) {
		System.out.println(b+" es el mayor");
		}
		if (c>a&&c>b) {
		System.out.println(c+" es el mayor");
		}
		
		variable.close();
	}
}
		


		

	


