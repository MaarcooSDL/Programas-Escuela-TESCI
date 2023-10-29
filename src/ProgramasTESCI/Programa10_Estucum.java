package ProgramasTESCI;

import java.util.Scanner;
public class Programa10_Estucum {
    public static void main(String[] args) {
        int diah, mesh, diac, mesc;

        Scanner mc= new Scanner(System.in);

        System.out.println("Que dia es hoy (numero)");
        diah=mc.nextInt();

        System.out.println("En que mes estamos a el dia de hoy (numero)");
        mesh=mc.nextInt();

        System.out.println("Que dia es tu cumpleaños (numero)");
        diac=mc.nextInt();

        System.out.println("En que mes cumples años (numero)");
        mesc=mc.nextInt();

        if(diah==diac && mesh==mesc){
            System.out.println("Feliz cumpleaños");
        }
        else{
            System.out.println("No es hoy :(");
        }
    }
}
