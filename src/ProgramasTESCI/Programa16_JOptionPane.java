package ProgramasTESCI;

import javax.swing.*;
public class Programa16_JOptionPane {
    public static void main(String[] args) {

        String nombre;
        int edad;

        nombre=JOptionPane.showInputDialog("Ingresa tu nombre");
        edad=Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu edad"));

        JOptionPane.showMessageDialog(null,"Tu nombre es: "+nombre+"\n Tu edad es: "+edad);
    }
}
