import java.util.Scanner;

public class ActividadArreglos {

	public static void main(String[] args) {
		
		String[] nombre = new String[10];
		String[] apellido = new String[10];
		double[] nota = new double[10];
		double notaMasAlta = 0;
		int j=0;
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i<10; i++) 
		{
			j=i+1;
			System.out.println("Ingrese el nombre del estudiante:");
			nombre[i]=sc.next();
			
			System.out.println("Ingrese el apellido del estudiante:");
			apellido[i]=sc.next();
			
			System.out.println("Digite la nota del estudiante:");
			nota[i]=sc.nextDouble();
			
		}
		
		for (int i = 1; i<10; i++) {
			if (notaMasAlta < nota[i] || notaMasAlta < nota[i-1]) {
			notaMasAlta = (nota[i]<nota[i-1]?nota[i-1]:nota[i]);

			}
			}
		
		for (int i = 0; i<10; i++) 
		{
			System.out.println("Estudiante #"+(i+1)+": "+nombre[i]+" "+apellido[i]+"   Nota: "+nota[i]);
			System.out.println("");
		}
		
		System.out.println("El estudiante con la calificacion mas alta es: "+nombre[j]+" "+apellido[j]);
		System.out.println("Nota mas alta del curso: "+notaMasAlta);
	}

}