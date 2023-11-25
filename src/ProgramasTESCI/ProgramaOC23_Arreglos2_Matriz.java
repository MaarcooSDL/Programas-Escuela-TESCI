package ProgramasTESCI;
import java.util.Scanner;

public class ProgramaOC23_Arreglos2_Matriz {
    public static void main(String[] args) {
        int i, j;
        int filas=2, columnas=2;
        int[][] tabla=new int[filas][columnas];
        Scanner mc=new Scanner(System.in);

        for(i=0;i< tabla.length;i++){
            for(j=0;j<tabla[i].length;j++){
                System.out.println("Ingresa los elementos del arreglo");
                tabla[i][j]= mc.nextInt();
            }
        }
        for(i=0;i< tabla.length;i++){
            for(j=0;j< tabla[i].length;j++){
                System.out.print("\t"+tabla[i][j]);
            }
            System.out.println();
        }
    }
}
