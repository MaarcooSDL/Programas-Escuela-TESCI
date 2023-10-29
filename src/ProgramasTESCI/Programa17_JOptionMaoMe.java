package ProgramasTESCI;

import javax.swing.*;
public class Programa17_JOptionMaoMe {
    public static void main(String[] args) {

        int edad1, edad2;
        String nombre1, nombre2;

        nombre1=JOptionPane.showInputDialog("Ingresa el nombre de la primera persona");
        edad1=Integer.parseInt(JOptionPane.showInputDialog("Ingresa la edad"));

        nombre2=JOptionPane.showInputDialog("Ingresa el nombre de la primera persona");
        edad2=Integer.parseInt(JOptionPane.showInputDialog("Ingresa la edad"));

        if(edad1>=18){
            JOptionPane.showMessageDialog(null,"Tu nombre es: "+nombre1+" y eres mayor de edad");
        }
        else{
            JOptionPane.showMessageDialog(null,"Tu nombre es: "+nombre1+" y no eres mayor de edad");
        }
        if(edad2>=18){
            JOptionPane.showMessageDialog(null,"Tu nombre es: "+nombre2+" y eres mayor de edad");
        }
        else{
            JOptionPane.showMessageDialog(null,"Tu nombre es: "+nombre2+" y no eres mayor de edad");
        }
    }
}
