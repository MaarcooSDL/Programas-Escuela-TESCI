package Programas_de_Competencia_2;

// EJercicio 6 "Calcular e imprimir cuántos números son pares y cuántos impares de 10 números de entrada"
import java.util.Scanner;
public class Programa6 {
    public static void main(String[] args) {
        //Declaracion de variables
        int a, i, e=0, p=0, im=0;
        Scanner mc=new Scanner(System.in);
        //Estructura de control ciclica
        for ( i = 1; i<=10 ; i++) {
            e=e+1;
            System.out.println("Ingresa el "+e+"° numero");
            a=mc.nextInt();
            if(a%2==0){
                p=p+1;
            }
            else{
                im=im+1;
            }
        }
        System.out.println("La cantidad de numeros pares es: "+p+" y de impares es: "+im);
    }
}
