package Programas_de_Competencia_2;

//Ejercicio 1: "Calcular e imprimir el area de un triangulo"
import java.util.Scanner;
public class Programa1 {
    public static void main(String[] args) {
        //Definicion de Variables
        double b, a, rtd;
        Scanner mc= new Scanner(System.in);
        //Pedida de datos
        System.out.println("Ingresa la base y la altura");
        b=mc.nextDouble();
        a= mc.nextDouble();
        rtd=b*a;
        rtd=rtd/2;
        //Impresion de resultados
        System.out.println("El area de tu triangulo es: "+rtd);
    }
}
