import java.util.Scanner;

public class algoritmofunciones1 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*escribe una funcion que devuelva el resultado de un numero elevado
		 * a un exponente dado
		 */
		double b;
		double e;
		
		Scanner variable=new Scanner(System.in);
		System.out.println("Ingrese Base: ");
		b=variable.nextDouble();
		System.out.println("Ingrese exponente");
		e=variable.nextDouble();
		
		
		double pow=Math.pow(b,e);
		System.out.println(b+" elevado a "+e+" = "+pow);
		
		variable.close();
	}
}
