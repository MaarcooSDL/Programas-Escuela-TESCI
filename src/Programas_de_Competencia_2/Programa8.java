package Programas_de_Competencia_2;

//Ejercicio 8 "Calcular e imprimir la suma de las potencias de 7 números de entrada"
import java.util.Scanner;
public class Programa8 {
        public static void main(String[] args) {
            //Definicion de variables
            int i, a, o = 0, p;
            double c, suma = 0;
            Scanner mc = new Scanner(System.in);
            //Estructura de control ciclica
            for (i = 1; i <= 7; i++) {
                o = o + 1;
                System.out.println("Ingresa tu " + o + "° numero");
                a = mc.nextInt();
                System.out.println("Ingresa la potencia que quieres");
                p= mc.nextInt();
                c = Math.pow(a, p);
                suma = suma + c;
            }
            //Impresion de resultados
            System.out.println("La suma de los cuadrados de las 7 potencias es: " + suma);
        }

}
