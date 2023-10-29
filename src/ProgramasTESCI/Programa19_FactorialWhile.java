package ProgramasTESCI;

import java.util.Scanner;
public class Programa19_FactorialWhile {
    public static void main(String[] args) {
        int i=1, copia, factorial;
        Scanner mc = new Scanner(System.in);
        System.out.println("Ingresa el numero para calcular el factorial");
        factorial=mc.nextInt();
        copia=factorial;
        while(i<copia){
            factorial=factorial*i;
            i++;
        }
        System.out.println("El factorial es: "+factorial);
    }
}
