package ProgramasTESCI;

import java.util.Scanner;
public class ProgramaOC22_Arreglos1 {
    public static void main(String[] args) {
        int[] calificacion=new int[2];
        String[] nombres=new String[2];
        int i;
        Scanner mc=new Scanner(System.in);
        for(i=0;i< calificacion.length;i++){
            System.out.println("Ingresa tu nombre");
            nombres[i]= mc.nextLine();
            System.out.println("Ingresa tu calificacion");
            calificacion[i]= mc.nextInt();
            mc.nextLine();
        }
        for(i=0;i< calificacion.length;i++){
            System.out.println("El nombre es: "+nombres[i]+" y la calificacion es: "+calificacion[i]);
        }
    }
}
