package guiasublime2;

import java.util.*;

public class algoritmofunciones4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* funcion que devuelva el factorial de un numero N,
		 * program que pida dos numeros y escriba los factoriales 
		 * de cada numero entre ellos.
		 */
			
	int a;
	int b;
	int resp;
	
	
	Scanner variable=new Scanner(System.in);
	System.out.println("ingrese a:");
	a=variable.nextInt();
	System.out.println("ingrese b:");
	b=variable.nextInt();
	
	if (a<b) {
	
		for (int i=a;i<=b;i++){
			
		resp=factorial (i);
		System.out.println(""+resp);
		}}
		
		else {
			for (int i=b;i<=a;i++) {
				resp=factorial (i);
				System.out.println(""+resp);
			}
			
	}
	
	
	
	
		
		variable.close();
		
	}

	
	
	


	public static int factorial(int n) {
        int resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
}
}
	


