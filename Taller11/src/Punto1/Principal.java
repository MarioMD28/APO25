package Punto1;

public class Principal {
public static void main(String[] args) {
	
	//Ejemplos
	Cuenta cuenta1 = new Cuenta("Pablo", 700);
    Cuenta cuenta2 = new Cuenta("Mario", 600);

    //Ingresos
    cuenta1.ingresar(300);
    cuenta2.ingresar(400);

    //Retiros
    cuenta1.retirar(500);
    cuenta2.retirar(100);
     
    System.out.println(cuenta1);
    System.out.println("--------------------------------------------------");
    System.out.println(cuenta2);
     
}

}

