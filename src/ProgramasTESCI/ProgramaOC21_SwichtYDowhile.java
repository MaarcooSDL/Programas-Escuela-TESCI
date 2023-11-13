package ProgramasTESCI;

import java.util.Scanner;
public class ProgramaOC21_SwichtYDowhile {
    public static void main(String[] args) {
        int valor1, valor2, opcion, continuar;
        double resultado;
        Scanner mc = new Scanner(System.in);
        do{
            System.out.println("Escoja una opcion");
            System.out.println("1. Suma\t\n 2. Resta\t\n 3. Multiplicacion \t\n 4. Divicion \t\n");
            opcion= mc.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Ingresa el primer valor");
                    valor1= mc.nextInt();
                    System.out.println("Ingresa el segundo valor");
                    valor2= mc.nextInt();
                    resultado=valor1+valor2;
                    System.out.println("El resultado de tu suma es: "+resultado);
                    break;
                case 2:
                    System.out.println("Ingresa el primer valor");
                    valor1= mc.nextInt();
                    System.out.println("Ingresa el segundo valor");
                    valor2= mc.nextInt();
                    resultado=valor1-valor2;
                    System.out.println("El resultado de tu resta es: "+resultado);
                    break;
                case 3:
                    System.out.println("Ingresa el primer valor");
                    valor1= mc.nextInt();
                    System.out.println("Ingresa el segundo valor");
                    valor2= mc.nextInt();
                    resultado=valor1*valor2;
                    System.out.println("El resultado de tu multiplicacion es: "+resultado);
                    break;
                case 4:
                    System.out.println("Ingresa el primer valor");
                    valor1= mc.nextInt();
                    System.out.println("Ingresa el segundo valor");
                    valor2= mc.nextInt();
                    resultado=valor1 /valor2;
                    System.out.println("El resultado de tu divicion es: "+resultado);
                    break;
                default:
                    System.out.println("Operacion invalida");
            }
            System.out.println("¿Deseas continuar?\t\n 1. Si\t\n 2. No");
            continuar= mc.nextInt();
        } while(continuar==1);

    }
}
