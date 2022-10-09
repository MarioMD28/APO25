package Punto8;
import java.util.Scanner;

public class Matrices {

	public static void main(String[] args) {
		 
		int[][] A = new int[2][2];
		int[][] B = new int[2][2];
		int elecc;
		Scanner sc = new Scanner(System.in);
		
		do{
			menu();
			elecc = sc.nextInt();
			switch(elecc){
					case 1:
						ingreseMatriz(A);
						break;
					case 2:
						ingreseMatriz(B);
						break;
					case 3:
						sumaM(A,B);
						break;
					case 4:
						restaM(A,B);
						break;
					case 5:
						multiplicaM(A,B);
						break;
					case 6:
						break;
			}
			}while(elecc != 6);
			}
	
	public static void menu(){
		System.out.println("1. Ingrese la matriz A");
		System.out.println("2. Ingrese la matriz B");
		System.out.println("3. Mostrar A + B");
		System.out.println("4. Mostrar A - B");
		System.out.println("5. Mostrar A * B");
		System.out.println("6. Salir");
	}
	public static void ingreseMatriz(int[][] a){
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese el elemento en la primera fila y la primera columna: ");
		a[0][0] = sc.nextInt();
		System.out.print("Ingrese el elemento en la primera fila y la segunda columna: ");
		a[0][1] = sc.nextInt();
		System.out.print("Ingrese el elemento en la segunda fila y la primera columna: ");
		a[1][0] = sc.nextInt();
		System.out.print("Ingrese el elemento en la segunda fila y la segunda columna: ");
		a[1][1] = sc.nextInt();
	}

	public static void sumaM(int[][] a,int[][] b){
		System.out.println("A + B es");
		System.out.println((a[0][0]+b[0][0]) + "\t" + (a[0][1]+b[0][1]));
		System.out.println((a[1][0]+b[1][0]) + "\t" + (a[1][1]+b[1][1]));
	}

	public static void restaM(int[][] a,int[][] b){
		System.out.println("A - B es");
		System.out.println((a[0][0]-b[0][0]) + "\t" + (a[0][1]-b[0][1]));
		System.out.println((a[1][0]-b[1][0]) + "\t" + (a[1][1]-b[1][1]));
	}
	
	public static void multiplicaM(int[][] a,int[][] b){
		System.out.println("A * B es");
		System.out.println((a[0][0]*b[0][0] + a[0][1]*b[1][0]) + "\t" + (a[0][0]*b[0][1] + a[0][1]*b[1][1]));
		System.out.println((a[1][0]*b[0][0] + a[1][1]*b[1][0]) + "\t" + (a[1][0]*b[0][1] + a[1][1]*b[1][1]));
	}

}

