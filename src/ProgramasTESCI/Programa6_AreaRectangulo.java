package ProgramasTESCI;

import java.util.Scanner;
import java.text.DecimalFormat;
public class Programa6_AreaRectangulo {

    public static void main(String[] args){

        double base, altura, resultado;
        Scanner mc= new Scanner(System.in);
        System.out.println("Ingresa la medida de tu base");
        base= mc.nextDouble();
        System.out.println("Ingresa la medida de tu altura");
        altura= mc.nextDouble();

        resultado=base*altura;
        DecimalFormat cm = new DecimalFormat("#.00");

        System.out.println("EL resultado del area de tu rectangulo es: "+cm.format(resultado));
    }
}
