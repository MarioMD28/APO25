package Punto2;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		String nombre = JOptionPane.showInputDialog("Introduce el nombre de la persona");


        String texto = JOptionPane.showInputDialog("Introduce la edad de la persona");
        int edad = Integer.parseInt(texto);


        texto = JOptionPane.showInputDialog("Introduce el sexo de la persona");
        char sexo = texto.charAt(0);


        texto = JOptionPane.showInputDialog("Introduce el peso de la persona");
        double peso = Double.parseDouble(texto);


        texto = JOptionPane.showInputDialog("Introduce la altura de la persona");
        double altura = Double.parseDouble(texto);


        Persona persona = new Persona(nombre, edad, sexo, peso, altura);


        System.out.println("Persona:");
        MuestraMensajePeso(persona);
        MuestraMayorDeEdad(persona);
        System.out.println(persona.toString());

    }


    public static void MuestraMensajePeso(Persona per) {
        int IMC = per.calcularIMC();
        switch (IMC) {

            case Persona.pesoIdeal:
                System.out.println("La persona esta en su peso ideal");
                break;

            case Persona.bajoPeso:
                System.out.println("La persona esta por debajo de su peso ideal");
                break;

            case Persona.sobrePeso:
                System.out.println("La persona esta por encima de su peso ideal");
                break;

        }

    }


    public static void MuestraMayorDeEdad(Persona p) {

        if (p.esMayorDeEdad()) {
            System.out.println("La persona es mayor de edad");
        } else {
            System.out.println("La persona no es mayor de edad");

        }

    }

}
