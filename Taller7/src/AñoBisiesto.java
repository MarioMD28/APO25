import java.util.Scanner;

public class AñoBisiesto {

	public static void main(String[] args) {
		
				 Scanner sc = new Scanner(System.in);
			     int year = 0;
			     
			     System.out.println("Este programa ayuda a saber si un año es bisiesto o no");
			     System.out.println("Digite el año:  ");
			     year = sc.nextInt();

			      if ( ( ( year % 4 == 0 ) && ( year % 100 != 0 ) ) || ( year % 400 == 0 ) ) {
			         System.out.println( year + " es un año bisiesto.");
			      }
			      else {
			         System.out.println( year + " no es un año bisiesto.");
			      }      
			   }

	}

