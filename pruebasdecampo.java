

package calculadora;
import java.util.*;

public class pruebasdecampo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner entrada=new Scanner(System.in);
		String a;
		int n;
		int m;
		System.out.println("ingrese numero:");
		a=entrada.nextLine();
		System.out.println("ingrese base n del numero");
		n=entrada.nextInt();
		System.out.println("ingrese base m para transformar");
		m=entrada.nextInt();
		
		String resultado;
		resultado=Conv(a,n,m);
		System.out.println("El cambio de base "+n+" a base "+m+" es: "+resultado);
		entrada.close();
	
	}


	public static String Conv(String a, int b, int c) {
		int a1 = Integer.parseInt(a, b);
		String resultado = Integer.toString(a1, c);
		return resultado;
	}
}
		
		
		
		
	
	


