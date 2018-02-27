package nextu.listas;

import nextu.listas.model.CompuList;

/**
 *
 * @author arthur.picerna
 */
public class Lista {

    private static final int[] lista = {12, 69, 42, 35, 74, 56, 87, 5, 29, 14};

    public static void main(String[] args) {
        for (int i = 0; i < Lista.lista.length; i++) {
            System.out.println(lista[i]);
        }

        int[][] matrice1 = {{1, 1, 1}, {1, 1, 1}};
        int[][] matrice2 = {{2, 2, 2}, {2, 2, 2}};
        int[][] matrice3 = new int[3][3];
        for (int i = 0; i < matrice1.length; i++) {
            System.out.print("[");
            for (int j = 0; j < matrice1[i].length; j++) {
                matrice3[i][j] = matrice1[i][j] + matrice2[i][j];
                System.out.print(matrice3[i][j]);
            }
            System.out.print("]\n");
        }

        CompuList compuList = new CompuList();

        compuList.addCompu("ss1","ss1","ss1","ss1");
        compuList.addCompu("ss1","ss1","ss1","ss1");
        compuList.removeCompu();
        System.out.println(compuList.showAll());
    }

}
