import java.util.Scanner;

public class Algoritmo9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*algoritmo que dado un n diga en pantalla si es par o impar, en caso de cero
		 * debe visualizar "el numero no es par ni impar"
		 */

		int n;
		int aux=1;
		
		Scanner nombre= new Scanner(System.in);
		System.out.println("ingrese un numero : ");
		n=nombre.nextInt();
		
		if (n==0){
			System.out.println("el numero no es par ni impar");
		}
		else{
			for(int i=0;i<n;i++){
				aux=1-aux;
			}
			if(aux==0){
				System.out.println("es un numero impar");
			}
			if(aux==1){
				System.out.println("es un numero par");
			}
			}
		}
		

	}
			

