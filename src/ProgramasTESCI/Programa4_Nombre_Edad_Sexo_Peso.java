package ProgramasTESCI;

import java.util.Scanner;

public class Programa4_Nombre_Edad_Sexo_Peso {

    public static void main(String[] args){

        String nombre ="";
        char sexo=' ';
        int edad;
        double peso = 0;

        Scanner sc= new Scanner(System.in);

                System.out.println("Ingresa el nombre");
                nombre=sc.nextLine();

                System.out.println("Ingresa la edad");
                edad=sc.nextInt();

                System.out.println("Ingresa el peso");
                peso=sc.nextDouble();

                System.out.println("Ingresa el sexo");
                sexo=sc.next().charAt(0);

        System.out.println("El nombre que ingresaste es: "+nombre+" El sexo es: "+sexo);
        System.out.println("La edad es: "+edad);
        System.out.println("El peso es: "+peso);
    }
}
