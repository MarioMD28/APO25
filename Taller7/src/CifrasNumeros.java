import java.io.IOException;
import java.util.Scanner;

public class CifrasNumeros {

	public static void main(String[] args) throws IOException {
		
	     Scanner sc = new Scanner(System.in);
	     int num, totCifras;
	     char op;
	     
	     do{
	         System.out.print("Por favor introduzca un numero entero cualquiera: ");
	         num = sc.nextInt();
	         totCifras = 0;    
	         while(num!= 0){            
	                 num = num/10;       
	                totCifras++;          
	         }
	         
	         System.out.println("El numero digitado tiene " + totCifras+ " cifras");
	         System.out.print("¿Desea continuar con el programa? ");
	         op = (char)System.in.read();
	     }
	     
	     while(op!= 'n' && op!= 'N');   
	 }

	}