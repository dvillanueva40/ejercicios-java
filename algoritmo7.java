package practicas;

import java.util.*;

public class algoritmo7 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		/*un colegio desea saber que porcentaje de ni�os
		 * y que porcentaje de ni�as hay en el curso actual.
		 * dise�ar un algoritmo para este proposito.
		 */
		int ni�as;
		int ni�os;
		double p;
		int total;
		Scanner a=new Scanner(System.in);
		System.out.println("Ingrese cantidad de ni�as");
		ni�as=a.nextInt();
		Scanner o=new Scanner(System.in);
		System.out.println("Ingrese cantidad de ni�os");
		ni�os=o.nextInt();
		
		total= ni�as + ni�os;
		
		double pni�as=(ni�as*100)/total;
		double pni�os=(ni�os*100)/total;
		
		System.out.println("el porcentaje de ni�as es "+pni�as+"%");
		System.out.println("el porcentaje de ni�os es "+pni�os+"%");
		
		
	}

}
