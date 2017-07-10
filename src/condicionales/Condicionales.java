package condicionales;

import javax.swing.*;

public class Condicionales {

    public static void main(String[] args) {

        String option = JOptionPane.showInputDialog(null, "Execute:\n1. edad\n2. anidado");

        // java <6
//        if (option.equals("anidado")) {
//            anidado();
//        } else if (option.equals("edad")) {
//            edad();
//        }
        // java 7+
        switch (option) {
            case "edad":
                edad();
                break;
            case "anidado":
                anidado();
                break;
        }
    }

    private static void edad() {
        int edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese tu edad:"));

        if (edad > 0 && edad < 18) {
            JOptionPane.showMessageDialog(null, "Joven");
        } else if (edad >= 18 && edad < 60) {
            JOptionPane.showMessageDialog(null, "Adulto");
        } else {
            JOptionPane.showMessageDialog(null, "Viejo");
        }
    }

    private static void anidado() {
        int a = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese primer numero"));
        int b = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese segundo numero"));
        int c = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese tercer numero"));

        if (a > b) {
            if (a > c) {
                JOptionPane.showMessageDialog(null, "Primer numero mayor");
            }
        } else if (b > a) {
            if (b > c) {
                JOptionPane.showMessageDialog(null, "Segundo numero mayor");
            } else {
                JOptionPane.showMessageDialog(null, "Tercer numero mayor");
            }
        }
    }
}
