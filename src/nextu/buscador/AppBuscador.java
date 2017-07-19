/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nextu.buscador;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author arthur.picerna
 */
public class AppBuscador {

    public static void main(String[] args) {
        ArrayList<ResultadoElemento> elementos;
        elementos = new ArrayList();
        elementos.add(new ResultadoElemento("test"));
        elementos.add(new ResultadoElemento("test2"));
        
        Scanner kb = new Scanner(System.in);
        Busqueda busqueda;
        ResultadoDeBusqueda resultado;
        String termino = "";
        Contenido contenido = null;
        int elemento = 0;
        int opcion = 0;
        do {
            System.out.println("Buscar: ");
            termino = kb.nextLine();
        } while (termino.length() <= 0);
        do {
            System.out.println("Añadir elemento ?\nSi: 1\nNo: 2");
            opcion = kb.nextInt();
        } while (opcion != 1 || opcion != 2);
        if (opcion == 1) {
            do {
                System.out.println("Que elemento ?\nImagen: 1\nDocumento: 2\nVideo: 3\nNinguno: 4");
                elemento = kb.nextInt();
            } while (elemento != 1 || elemento != 2 || elemento != 3 || elemento != 4);
            switch (elemento) {
                case 1:
                    contenido = new Imagen();
                    break;
                case 2:
                    contenido = new Documento();
                    break;
                case 3:
                    contenido = new Video();
                    break;                    
            }
        }
        if(contenido != null) {
            busqueda = new Busqueda(termino, contenido);
        } else {
            busqueda = new Busqueda(termino);
        }
        resultado = busqueda.buscar(elementos);
    }
}
