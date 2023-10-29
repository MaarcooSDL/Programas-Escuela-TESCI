package Programas_de_Competencia_2;

//Ejercicio3 "Calcular e imprimir de 8 números enteros de entrada la suma de sus cuadrados"
import java.util.Scanner;
public class Programa3 {
    public static void main(String[] args) {
        //Definicion de variables
        int  i, a, o=0;
        double c, suma=0;
        Scanner mc=new Scanner(System.in);
        //Estructura de control ciclica
        for(i=1;i<=8;i++){
            o=o+1;
            System.out.println("Ingresa tu "+o+"° numero");
            a=mc.nextInt();
            c=Math.pow(a,2);
            suma=suma+c;
        }
        //Impresion de resultados
        System.out.println("La suma de los cuadrados de los 8 numeros es: "+suma);
    }
}
