package ProgramasTESCI;

import java.util.Scanner;
public class Programa15_WhileIMPAR {
    public static void main(String[] args) {
        int a, i=1;
        Scanner mc=new Scanner(System.in);
        while(i<=3){
            System.out.println("Ingresa un numero");
            a=mc.nextInt();
            if(a%2==0){
                System.out.println(a+" es par");
            }
            else{
                System.out.println(a+" es impar");
                i=i+1;
            }
        }
    }
}
