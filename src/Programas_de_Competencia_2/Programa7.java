package Programas_de_Competencia_2;

//Ejercicio 7 "Calcular e imprimir una tabla de multiplicar para cualquier número"
import java.util.Scanner;
public class Programa7 {
    public static void main(String[] args) {
        //Declaracion de variables
        int i, a, o, b;
        Scanner mc=new Scanner(System.in);
        System.out.println("Ingresa el numero de la tabla que quieres ver");
        a=mc.nextInt();
        o=0;
        //Estructura de control ciclica
        for(i=1;i<=10;i++){
            o=o+1;
            b=a*o;
            //Impresion de resultados7
            System.out.println(a+"*"+o+"="+b);
        }
    }
}
