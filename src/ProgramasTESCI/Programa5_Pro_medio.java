package ProgramasTESCI;

import java.util.Scanner;
import java.text.DecimalFormat;
public class Programa5_Pro_medio {

    public static void main(String[] args){

        String nombre;
        char sexo;
        int num1, num2, num3;

        double promedio;

        Scanner mc = new Scanner(System.in);

        System.out.println("Ingresa tu nombre");
        nombre= mc.nextLine();

        System.out.println("Ingresa tu sexo");
        sexo=mc.next().charAt(0);

        System.out.println("Ingresa la primer calificacion");
        num1=mc.nextInt();

        System.out.println("Ingresa la segunda calificacion");
        num2=mc.nextInt();

        System.out.println("Ingresa la tercer calificacion");
        num3=mc.nextInt();
        promedio=num1+num2+num3;
        promedio=promedio/3;
        System.out.println("Tu nombre es: "+nombre);
        System.out.println("Tu sexo es: "+sexo);
        System.out.println("Las calificaciones que ingresaste son: "+num1+", "+num2+", "+num3);
        DecimalFormat dec=new DecimalFormat("#.00");
        System.out.println("El promedio es: "+dec.format(promedio));
    }
}
