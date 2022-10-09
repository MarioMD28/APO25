package Punto7;
import java.util.Scanner;

public class PromedioPuebas {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
			double [] notas = new double [5] ;
			double total = 0;
			double prom = 0;

		 for(int i = 0; i < 5; i++){
		 System.out.println("Ingrese el puntaje de la prueba");
		 notas[i] = sc.nextDouble();
		 total+=notas[i];
	}
		 
		 prom = total / 5;
		 System.out.println("El promedio de las 5 pruebas es de: " + prom);
	
	}
		

	}

