package ProgramasTESCI;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Programa7_AreaCirculo {

    public static void main(String[] args){

        double pi=3.1416, radio, resultado;
        Scanner mc= new Scanner(System.in);
        System.out.println("Ingresa la medida de tu radio");
        radio= mc.nextDouble();
        resultado=radio*radio*pi;
        DecimalFormat cm= new DecimalFormat("#.00");
        System.out.println("El resultado de tu area es: "+cm.format(resultado));
    }
}
