
	package calculadora;
import java.util.*;
public class promedios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ERROR DE LECTURA SCANNER, SE SALTA LINEA
		Scanner entrada = new Scanner(System.in);

		int dato1;
		String dato2;

		System.out.println("Introduce dato1: ");
		dato1 = entrada.nextInt();

		// 1° solucion poner un nextline(); para que tome el enter final del next int de arriba
		//entrada.nextLine();
		// 2° -Leer el tipo de dato como String y luego hacer un casting y convertirlo al tipo de dato que queramos.
		//dato1 = entrada.nextLine();
		// 3° usar metodo skip de scanner
		//entrada.skip("\n");

		System.out.println("Introduce dato2: ");
		dato2 = entrada.nextLine();
	}

}


	
		
		
		
	
	


