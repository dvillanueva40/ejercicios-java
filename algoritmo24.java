package practicas;

import java.util.Scanner;

public class algoritmo24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*algoritmo que lea las unidades consumidas  y calcule el total de la cuenta
		 * precios por alimento: completo 1500,bebida 2000, cerveza 2500,
		 * helado 3000,plato de fideos 2000,plato de huachalomo 3000, porotos 
		 * sin rienda 2000.
		 */
		
		int completo;
		int bebida;
		int cerveza;
		int helado;
		int fideos;
		int huachalomo;
		int porotos;
		int total;
		
		Scanner a=new Scanner(System.in);
		System.out.println("Ingrese cantidad de completos: ");
		completo=a.nextInt();
		Scanner b=new Scanner(System.in);
		System.out.println("Ingrese cantidad de bebidas: ");
		bebida=b.nextInt();
		Scanner c=new Scanner(System.in);
		System.out.println("Ingrese cantidad de cervezas: ");
		cerveza=c.nextInt();
		Scanner d=new Scanner(System.in);
		System.out.println("Ingrese cantidad de helados: ");
		helado=d.nextInt();
		Scanner e=new Scanner(System.in);
		System.out.println("Ingrese cantidad de platos de fideos: ");
		fideos=e.nextInt();
		Scanner f=new Scanner(System.in);
		System.out.println("Ingrese cantidad de platos de huachalomo: ");
		huachalomo=f.nextInt();
		Scanner g=new Scanner(System.in);
		System.out.println("Ingrese cantidad de porotos sin riendas: ");
		porotos=g.nextInt();
		
		total=((completo*1500)+(bebida*2000)+(cerveza*2500)+(helado*3000)+(fideos*2000)+(huachalomo*3000)+(porotos*2000));
		
		System.out.println("el total de la cuenta es: "+total);
		
	}

}
