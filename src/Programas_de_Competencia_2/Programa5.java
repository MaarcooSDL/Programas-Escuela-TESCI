package Programas_de_Competencia_2;

//Calcular e imprimir cuántos empleados de un grupo de 20 se puede jubilar,
//para ello es importante atender a las siguientes condiciones.
//a).- Se jubilan con más de 50 años de edad y más de 30 años de servicio.
//b).- Calcular e imprimir cuántos hombres se jubilaron.
//c).- Calcular e imprimir cuántas mujeres se jubilaron
import java.util.Scanner;
public class Programa5 {
    public static void main(String[] args) {
        //Definicion de variables
        int i, a, h=0, m=0, v;
        char s;
        Scanner mc= new Scanner(System.in);
        //Estructura de control ciclica
        for(i=1;i<=20;i++){
            System.out.println("Ingresa tu sexo");
            s=mc.next().charAt(0);
            //Estructura de control desiciva
            if(s=='h'){
                System.out.println("¿Cuantos años tienes?");
                a= mc.nextInt();
                System.out.println("¿Cuantos años de servicio tienes?");
                v= mc.nextInt();
                if(a>=50 && v>=30){
                    h=h+1;
                }
                }
            else{
                System.out.println("¿Cuantos años tienes?");
                a= mc.nextInt();
                System.out.println("¿Cuantos años de servicio tienes?");
                v= mc.nextInt();
                if(a>=50 && v>=30){
                    m=m+1;
                }
            }
        }
        //Impresion de resultados
        System.out.println("Se pueden jubilar: "+h+" hombes");
        System.out.println("Se pueden jubilar: "+m+" mujeres");
    }
}
