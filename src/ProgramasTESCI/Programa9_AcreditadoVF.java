package ProgramasTESCI;

import java.util.Scanner;
public class Programa9_AcreditadoVF {
    public static void main(String[] args) {
        double promedio;
        String nombre;

        Scanner mc= new Scanner(System.in);

        System.out.println("Ingresa tu nombre");
        nombre = mc.nextLine();

        System.out.println("Ingresa tu promedio");
        promedio= mc.nextDouble();

        if(promedio>=6.0){
            System.out.println("Tu nombre es: "+nombre+" y estas acreditado con: "+promedio);
        }
        else{
            System.out.println("Tu nombre es: "+nombre+" y estas reprobado con: "+promedio);
        }
    }
}
