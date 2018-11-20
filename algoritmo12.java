
import java.util.Scanner;

public class algoritmo12 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//algoritmo que calcule el cuadrado delos primeros N numeros naturales.
		
		int n;
		int c=0;
		int i=1;
		System.out.println("los cuadrados de los N njumeros naturales");
		Scanner nombre= new Scanner(System.in);
		System.out.println("Ingrese un numero N");
		n=nombre.nextInt();
		
		while (i<n) {
			c=i*i;
			System.out.println("El cuadrado de "+i+"es"+c);
			i++;
			
		}
		
		nombre.close();
		
	}

}
