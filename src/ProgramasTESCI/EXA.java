package ProgramasTESCI;

import java.util.Scanner;
public class EXA {
    public static void main(String[] args) {
        int opciones, promedio, continuar;
        double resultado, costoC=4500, costoI=2300, costoq=6000, costom=6300;
        Scanner mc=new Scanner (System.in);
        do{
            System.out.println("Elige una opcion");
            System.out.println("1. Computacion\n 2. Ingles\n 3. Quimica\n 4. Matematicas");
            opciones= mc.nextInt();
            switch (opciones){
                case 1:
                    System.out.println("Curso Computacion\n 'Computacion basica 1'\n Duracion del curso: 36hrs\n Costo del curso: "+costoC);
                    System.out.println("¿De cuanto es tu promedio (sin decimales)?");
                    promedio=mc.nextInt();
                    if(promedio>70 && promedio<85){
                        resultado=costoC*.95;
                        System.out.println("Tienes un descuento de 5% y tu precion a pagar es: "+resultado);
                    }
                    else{
                        System.out.println("No tienes un descuento y pagas precio completo: "+costoC);
                    }
                    break;
                case 2:
                    System.out.println("Curso Ingles\n 'Ingles basico 1'\n Duracion del curso: 64hrs\n Costo del curso: "+costoI);
                    System.out.println("¿De cuanto es tu promedio (sin decimales)?");
                    promedio= mc.nextInt();
                    if(promedio>70 && promedio<85){
                        resultado=costoI*.95;
                        System.out.println("Tienes un descuento de 5% y tu precion a pagar es: "+resultado);
                    }
                    else {
                        System.out.println("No tienes un descuento y pagas precio completo: " + costoI);
                    }
                    break;
                case 3:
                    System.out.println("Curso Quimica\n 'Quimica basica 1'\n Duracion del curso: 120hrs\n Costo del curso: "+costoq);
                    System.out.println("¿De cuanto es tu promedio (sin decimales)?");
                    promedio= mc.nextInt();
                    if(promedio>85){
                        resultado=costoq*.93;
                        System.out.println("Tienes un descuento de 7% y tu precion a pagar es: "+resultado);
                    }
                    else {
                        System.out.println("No tienes un descuento y pagas precio completo: " + costoq);
                    }
                    break;
                case 4:
                    System.out.println("Curso Matematicas\n 'Matematicas basicas 1'\n Duracion del curso: 80hrs\n Costo del curso: "+costom);
                    System.out.println("¿De cuanto es tu promedio (sin decimales)?");
                    promedio= mc.nextInt();
                    if( promedio>85){
                        resultado=costom*.93;
                        System.out.println("Tienes un descuento de 7% y tu precion a pagar es: "+resultado);
                    }
                    else {
                        System.out.println("No tienes un descuento y pagas precio completo: " + costoq);
                    }
                    break;
                default:
                    System.out.println("Opción no valida");
                    break;
            }
            System.out.println("Deseas continuar");
            System.out.println("1. Si\n 2. No");
            continuar= mc.nextInt();
        }while(continuar==1);
    }
}
