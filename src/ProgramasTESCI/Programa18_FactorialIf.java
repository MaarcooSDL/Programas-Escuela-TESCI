package ProgramasTESCI;

import java.util.Scanner;
public class Programa18_FactorialIf {
    public static void main(String[] args) {
        int factorial, i, copia;
        Scanner mc= new Scanner(System.in);
        System.out.println("Ingresa el numero para calcular su factorial");
        factorial=mc.nextInt();
        copia=factorial;
        for(i=1;i<copia;i++){
            factorial=factorial*i;
        }
        System.out.println("El factorial es: "+factorial);
    }
}
