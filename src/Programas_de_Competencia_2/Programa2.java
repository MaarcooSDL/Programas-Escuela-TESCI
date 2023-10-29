package Programas_de_Competencia_2;

//Ejercicio2: "Calcular e imprimir la suma de 6 areas de triangulos"
import java.util.Scanner;
public class Programa2 {
    public static void main(String[] args) {
        //Definicion de variables
        int i, o=0;
        double b, a, rts, suma=0;
        Scanner mc = new Scanner(System.in);
        //Estructura de control ciclica
        for(i=1;i<=6;i++){
            o=o+1;
            System.out.println("Ingresa la base y la altura de tu "+o+"° triangulo");
            b= mc.nextDouble();
            a= mc.nextDouble();
            rts=b*a;
            rts=rts/2;
            suma=suma+rts;
        }
        //Impresion de resultados
        System.out.println("La suma de las 6 areas de triangulos es: "+suma);
    }
}
