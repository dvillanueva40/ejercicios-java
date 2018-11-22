package guiasublime2;
import java.util.*;
public abstract class Algoritmofunciones9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Dado un entero nos devuelve la cantidad de cifras por las que esta compuesto.
		 * numero no debe ser menor o igual que cero
		 * ejemplo 253, devuelve un 3
		 */
		
		int count=0;
		int N;
		
		Scanner variable=new Scanner(System.in);
		System.out.println("Ingrese N");
		N=variable.nextInt();
		count=F(N);
		System.out.println("N esta compuesto por "+count+" cifras");
		
		variable.close();
	}
	public static int F (int N) {
		int count=0;
		while (N>=1) {
			N=N/10;
			count=count+1;
		}
		return count;
	}

}
