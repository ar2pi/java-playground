package condicionales;

import java.util.Scanner;
import javax.swing.*;

public class Condicionales {

    public static void main(String[] args) {

//        Scanner keyboard = new Scanner(System.in);
//        System.out.println("Execute:\n\t1. edad\n\t2. anidado\n\t3. switchmenu");
//        String choice = keyboard.nextLine();

        String choice = JOptionPane.showInputDialog(null, "Execute:\n1. edad\n2. anidado\n3. switchmenu");

        // java <6
//        if (option.equals("anidado")) {
//            anidado();
//        } else if (option.equals("edad")) {
//            edad();
//        }
        // java 7+
        switch (choice) {
            case "edad":
                edad();
                break;
            case "anidado":
                anidado();
                break;
            case "switchmenu":
                switchmenu();
                break;
            case "restaurant":
                restaurant();
                break;
            case "catcherror":
                catcherror();
                break;
            case "catcherror2":
                catcherror2();
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

    private static void switchmenu() {
        int a = Integer.parseInt(JOptionPane.showInputDialog(null, "a:"));
        int b = Integer.parseInt(JOptionPane.showInputDialog(null, "b:"));

        String option = JOptionPane.showInputDialog(null, "Opciones:\n\t1. mayor\n\t2. suma\n\t3. resta");

        switch (option) {
            case "mayor":
                if (a > b) {
                    JOptionPane.showMessageDialog(null, "a");
                } else if (a < b) {
                    JOptionPane.showMessageDialog(null, "b");
                } else {
                    JOptionPane.showMessageDialog(null, "ninguno");
                }
                break;
            case "suma":
                JOptionPane.showMessageDialog(null, "a+b: " + (a + b));
                break;
            case "resta":
                JOptionPane.showMessageDialog(null, "a-b: " + (a - b));
                break;
        }
    }

    private static void restaurant() {
        Scanner kb = new Scanner(System.in);

        System.out.print("iteraciones:");
        int num = kb.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.println("Restaurante para programadores - " + (i + 1));
        }
    }

    private static void catcherror() {
        try {
            int i = 0;
            do {
                int n = Integer.parseInt(JOptionPane.showInputDialog(null, "cadena:"));
                i++;
            } while (i < 5);
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "input error");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "number format error");
        }
    }

    private static void catcherror2() {
        try {
            int a = Integer.parseInt(JOptionPane.showInputDialog(null, "a:"));
            int b = Integer.parseInt(JOptionPane.showInputDialog(null, "b:"));
            int n;
            do {
                n = Integer.parseInt(JOptionPane.showInputDialog(null, "1. sumar\n2. restar\n0. salir"));
                switch(n) {
                    case 0:
                        break;
                    case 1:
                        JOptionPane.showMessageDialog(null,"a+b=" + (a+b));
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null,"a-b=" + (a-b));
                        break;
                }
            } while (n != 0);
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "input error");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "number format error");
        }
    }
}
