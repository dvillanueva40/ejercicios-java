package practicas;

import java.util.Scanner;

public class algoritmo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*algoritmo que lea dos numeros y nos diga cual de ellos es mayor,
		 * o bien si son iguales
		 */
		int a;
		int b;
		
		Scanner variable=new Scanner(System.in);
		System.out.println("Ingrese A: ");
		a=variable.nextInt();
		System.out.println("Ingrese B: ");
		b=variable.nextInt();
		
		if ((a-b)>0){
			System.out.println("A "+a+" ES MAYOR QUE B "+b);
		}
		if ((a-b)<0) {
			System.out.println("B "+b+" ES MAYOR QUE A "+a);
		}
		if ((a-b)==0) {
			System.out.println("A "+a+" y B "+b+" SON IGUALES");
			
		variable.close();	
		}
		}
		
		

	}

