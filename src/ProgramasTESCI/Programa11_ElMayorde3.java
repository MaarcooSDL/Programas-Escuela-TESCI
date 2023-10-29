package ProgramasTESCI;

import java.util.Scanner;
public class Programa11_ElMayorde3 {
    public static void main(String[] args) {

        int num1, num2, num3;
        Scanner mc = new Scanner(System.in);

        System.out.println("Ingresa 3 numeros");
        num1=mc.nextInt();
        num2=mc.nextInt();
        num3=mc.nextInt();

        if(num1>num2 && num1>num3){
            System.out.println("El mayor es num1 y es: "+num1);
        }
        else if(num2>num1 && num2>num3){
            System.out.println("El mayor es num2 y es: "+num2);
        }
        else{
            System.out.println("El mayor es num3 y es: "+num3);
        }
    }
}
