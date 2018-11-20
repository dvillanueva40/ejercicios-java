package practicas;

import java.util.*;

public class algoritmo7 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		/*un colegio desea saber que porcentaje de niños
		 * y que porcentaje de niñas hay en el curso actual.
		 * diseñar un algoritmo para este proposito.
		 */
		int niñas;
		int niños;
		double p;
		int total;
		Scanner a=new Scanner(System.in);
		System.out.println("Ingrese cantidad de niñas");
		niñas=a.nextInt();
		Scanner o=new Scanner(System.in);
		System.out.println("Ingrese cantidad de niños");
		niños=o.nextInt();
		
		total= niñas + niños;
		
		double pniñas=(niñas*100)/total;
		double pniños=(niños*100)/total;
		
		System.out.println("el porcentaje de niñas es "+pniñas+"%");
		System.out.println("el porcentaje de niños es "+pniños+"%");
		
		
	}

}
