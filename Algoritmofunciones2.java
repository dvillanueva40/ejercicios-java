import java.util.Scanner;

public class Algoritmofunciones2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Funcion que devuelva el area del circulo dado su radio.
		
		
		double r;
		double area;
		Scanner variable=new Scanner(System.in);
		System.out.println("Ingrese el radio del circulo: ");
		r=variable.nextDouble();
		
		area=Math.PI*Math.pow(r,2);
		System.out.println("El area del circulo es: "+area);
		
		variable.close();
	}
}	


