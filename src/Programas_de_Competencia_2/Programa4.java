package Programas_de_Competencia_2;

//Calcular e imprimir el número de cifras que tiene un número de entrada (solo 3 cifras)
import java.util.Scanner;
public class Programa4 {
    public static void main(String[] args) {
        //Definicion de variables
        int a;
        Scanner mc = new Scanner(System.in);
        System.out.println("Escribe tu numero");
        a = mc.nextInt();
        //Estructura de control Decisiva
        if (a >= 0 && a <= 9) {
            //Impresion de resultados
            System.out.println("Tu numero tiene 1 cira");
        }
        else if (a >= 10 && a <= 99) {
            //Impresion de resultados
            System.out.println("Tu numero tiene 2 cifras");
        }
        else if(a>=100 && a<=999){
            //Impresion de resultados
            System.out.println("Tu numero tiene 3 cifras");
        }
    }
}
