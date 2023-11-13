package ProgramasTESCI;

import java. util.Scanner;
public class Programa20_8numeros {
    public static void main(String[] args) {
        int numero, i, ochos=0;
        Scanner mc=new Scanner(System.in);
        for(i=1;i<=8;i++){
                    System.out.println("Ingresa tu numero");
                    numero=mc.nextInt();
                    if(numero==8){
                        ochos=ochos+1;
                    }
            System.out.println("Los numeros que ingresaste son; "+numero);
                }
        System.out.println("El total de veces que se ingreso 8 fue"+ochos);
        }
    }
