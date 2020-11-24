public class spiralMatrix {
    public static void main(String[] args) {
        int mat[][] = { { 1, 2, 3, 4, 5, 6 }, { 7, 8, 9, 10, 11, 12 }, { 9, 8, 7, 6, 5, 4 } };
        spiralMat(3, 6, mat);

    }

    private static void spiralMat(int x, int y, int[][] mat) {
        int i, k = 0, l = 0;
        while (k < x && l < y) {
            for (i = l; i < y; ++i) {
                System.out.print(mat[k][i] + " ");
            }
            k++;
            for (i = k; i < x; ++i) {
                System.out.print(mat[i][y - 1] + " ");
            }
            y--;
            if (k < x) {
                for (i = y - 1; i >= l; --i) {
                    System.out.print(mat[x - 1][i] + " ");
                }
                x--;
            }
            if (l < y) {
                for (i = x - 1; i >= k; --i) {
                    System.out.print(mat[i][l] + " ");
                }
                l++;
            }
        }
    }

}
