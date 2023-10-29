package ProgramasTESCI;

public class Programa13_20ySuma {
    public static void main(String[] args) {
        int i, suma=0;
        for(i=20;i>=1;i--){
            System.out.println("Ahora i vale: "+i);
            suma=suma+i;
        }
        System.out.println("El resultado de la suma es de: "+suma);
    }
}
