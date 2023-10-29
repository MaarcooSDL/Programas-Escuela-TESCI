package ProgramasTESCI;

public class Programa12_Ciclofor {
    public static void main(String[] args) {
      int i;
      double cuadrado, suma=0;
      for(i=1;i<=5;i++){
          System.out.println("Esta vez i vale: "+i);
          cuadrado=Math.pow(i,2);
          System.out.println("Esta vez el cuadrado es: "+ cuadrado);
          suma=suma+cuadrado;
      }
        System.out.println("El ultimo valor de i es: "+i);
        System.out.println("La suma de los cuadrados es: "+suma);
    }
}
