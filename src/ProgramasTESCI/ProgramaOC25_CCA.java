//Elabore un programa utilizando arreglos que realice lo siguiente:
//a).- Elabore una matriz de 3 por 3 de números enteros.
//b).- Cada elemento del arreglo se eleva al cubo y se imprime en otra matriz.
//c).- Si un elemento del arreglo es mayor que 20 entonces en lugar del cubo se calcula su cuadrado.
//d).- De lo contrario solo se eleva al cubo.
package ProgramasTESCI; //Libreria del programa
import java.util.Scanner; //Se importa el Scanner
public class ProgramaOC25_CCA { //Inicio del programa
    public static void main(String[] args) { //Se apertura el MAIN en el programa
        int i, j; //Se declaran "i" y "j" para los ciclos
        int columnas = 3, filas = 3; //Se declaran el valor de las ""filas" y "coliumnas"
        int[][] tabla = new int[filas][columnas]; //Se declara mi tabla para guardar los datos
        double[][] resultado=new double[filas][columnas]; //Se declara una segunda tabla para guardar el resultado de las operaciones
        Scanner mc = new Scanner(System.in); //Se declara el Sccanner para guardar los datos del teclado
        System.out.println("Ingresa los numero de la matriz"); //El mensaje indica que debe hacer el usuario
        for(i=0;i< tabla.length;i++){ //El "for" es para introducir los datos de la primera matriz y sigue las actualizaciones de "i"
            for(j=0;j< tabla[i].length;j++){ //El "for" es para seguir las actualizaciones de "j" en base de "i"
                tabla[i][j]= mc.nextInt(); //Se guardan los datos en mi variable "tabla"
            } //Fin del ciclo "for" anidado
        } //Fin del primer ciclo "for"
        System.out.println("Los numero de la matriz son"); //El mensaje indica que debe hacer el usuario
        for (i=0;i< tabla.length;i++){ //El "for" es para imprimir la matriz en base a los datos del usuario y sigue las actualizaciones de "i"
            for(j=0;j< tabla[i].length;j++){ //El "for" sigue las actualizaciones de "j" en base de "i"
                System.out.print("\t"+tabla[i][j]); //El "print" imprime la matriz
            } //Fin del ciclo "for" anidado
            System.out.println(); //El "println" hace los saltos de linea para la matriz
        } //Fin del primer ciclo "for"
        System.out.println("El resultado de la matriz es"); //El mensaje indica lo que el usuario visualizara
        for(i=0;i< tabla.length;i++){ //El "for" calcular el "cuadrado" o "cubo" segun sea el caso y sigue las actualizaciones de "i"
            for(j=0;j< tabla[i].length;j++){ //El "for" sigue las actualizaciones de "j" en base de "i"
                if(tabla[i][j]>20){ //El ciclo "if" evalua que los datos del usuario cumplan o no una funcion
                    resultado[i][j]=Math.pow(tabla[i][j],2); //Si la condicion se cumple el dato del usuario se eleva al "cuadrado"
                } //Fin del ciclo "if"
                else{ //Inicio del "else" indica la parte contraria del "if"
                    resultado[i][j]=Math.pow(tabla[i][j],3); //Si la condicion no se cumple el resultado se eleva al "cubo"
                } //Fin del "else"
                System.out.print("\t"+resultado[i][j]); //Impresion de la matriz ya con operaciones hechas
            } //Fin del ciclo "for" anidado
            System.out.println(); //El "println" hace los saltos de linea para la matriz
        } //Fin del primer ciclo "for"
    } //Fin de la funcion "main"
} //Fin del programa
