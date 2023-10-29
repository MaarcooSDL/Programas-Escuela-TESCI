package Programas_de_Competencia_2;

//Ejercicio 10" Programa que calcule e imprima el 20% de descuento que se hace a un producto que tiene un precio asignado de entrada"
import java.text.DecimalFormat;
public class Programa10 {
    public static void main(String[] args) {
        //Declaracion de variables
        int ps=8499;
        double des;
        //Operaciones
        des=ps*.80;
        DecimalFormat mc=new DecimalFormat("#.##");
        //Impresion de resultados
        System.out.println("El precio es: "+ps+" y con descuento es: "+mc.format(des));
    }
}
