package ProgramasTESCI;

import java.util.Scanner;
public class Programa8_Compara2variables {

    public static void main(String[] args) {
        int num1, num2;
        Scanner cm = new Scanner(System.in);

        System.out.println("Ingresa tu primer numero");
        num1= cm.nextInt();

        System.out.println("Ingresa tu segundo numero");
        num2= cm.nextInt();

        if(num1>num2){
            System.out.println("El numero 1 es mayor y es igual a: "+num1);
        }
        else{
            System.out.println("El numero 2 es mayor y es igual a: "+num2);
        }
        System.out.println("Fin del programa");
    }
}
