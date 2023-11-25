package ProgramasTESCI;
import java.util.Scanner;
public class ProgramaOC24_SumaMM {
    public static void main(String[] args) {
        int i, j;
        int filas = 2, columnas = 2;
        int[][] matriz = new int[filas][columnas];
        int[][] matriz1=new int[filas][columnas];
        int[][] resultado=new int[filas][columnas];
        Scanner mc= new Scanner(System.in);
        System.out.println("Ingresa los numeros de la primera matriz");
        for(i=0;i< matriz.length;i++){
            for(j=0;j< matriz[i].length;j++){
                matriz[i][j]= mc.nextInt();
            }
        }
        System.out.println("Ingresa los numeros de la segunda matriz");
        for(i=0;i< matriz1.length;i++){
            for(j=0;j< matriz1[i].length;j++){
                matriz1[i][j]= mc.nextInt();
            }
        }
        System.out.println("El resultado de la suma es");
        for(i=0;i< resultado.length;i++){
            for(j=0;j< resultado[i].length;j++){
                resultado[i][j]=matriz[i][j]+matriz1[i][j];
                System.out.print("\t"+resultado[i][j]);
            }
            System.out.println();
        }
    }
}