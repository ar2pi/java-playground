package playground;

/**
 * Matrice
 */
public class Matrice {
    Matrice() {
        int[][] matrice1 = { { 1, 1, 1 }, { 1, 1, 1 } };
        int[][] matrice2 = { { 2, 2, 2 }, { 2, 2, 2 } };
        int[][] matrice3 = new int[3][3];
        for (int i = 0; i < matrice1.length; i++) {
            System.out.print("[");
            for (int j = 0; j < matrice1[i].length; j++) {
                matrice3[i][j] = matrice1[i][j] + matrice2[i][j];
                System.out.print(matrice3[i][j]);
            }
            System.out.print("]\n");
        }
    }
}