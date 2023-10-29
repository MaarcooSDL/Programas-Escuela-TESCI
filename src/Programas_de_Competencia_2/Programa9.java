package Programas_de_Competencia_2;

//Ejercicio 9 "Calcular e imprimir la suma de las raíces cuadradas de 6 números de entrada"
import java.util.Scanner;
public class Programa9 {
    public static void main(String[] args) {
        //Declaracion de variables
        int i, e=0;
        double p, o, a=0;
        Scanner mc=new Scanner(System.in);
        //Estructura de control ciclica
        for(i=1;i<=6;i++){
            e=e+1;
            System.out.println("Ingresa el numero "+e);
            o= mc.nextInt();
            p=Math.sqrt(o);
            a=a+p;
        }
        //Imprecion de resultados
        System.out.println("La suma de las raices cuadradas es: "+a);
    }
}
