package hu.nive.ujratervezes.kepesitovizsga.symmetricmatrix;

public class SymmetricMatrix {
    public static void main(String[] args) {

        isSymmetric(new int[][]{{1, 0, 1}, {0, 2, 2}, {1, 2, 5}});

    }

    public static boolean isSymmetric(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }
}
