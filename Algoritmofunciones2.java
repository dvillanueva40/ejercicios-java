import java.util.Scanner;

public class Algoritmofunciones2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Funcion que devuelva el termino N de la serie fibonacci.
		 *N es un entero positivo.
		 * ejemplo si se introduce un 3 nos devuelve un 2
		 */
		
		int N;
		int resp;
		
		Scanner variable=new Scanner(System.in);
		System.out.println("Ingrese un numero entero: ");
		N=variable.nextInt();
		resp=fibo(N);
		System.out.println("El termino N de la serie Fibonacci es: "+resp);
		
		variable.close();
	}
	public static int fibo(int n){
		 if (n>1){
		       return fibo(n-1) + fibo(n-2);  
		    }
		    else if (n==1) {  
		        return 1;
		    }
		    else if (n==0){  
		        return 0;
					
					
		}
		return n;
	}
}
	


