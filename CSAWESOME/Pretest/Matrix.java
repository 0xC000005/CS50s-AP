public class Matrix {

    public static void reverseAllRows(int[][] mat) {
        /* to be implemented in part (b) */
        for (int x = 0; x < mat.length; x++) {
            for (int y = 0; y < mat[0].length/ 2; y++) {
                int temp = mat[x][y];
                mat[x][y] = mat[x][mat[0].length - 1 - y];
                mat[x][mat[0].length - 1 - y] = temp;
                //printMatrix(mat);
            }
        }

    }

    public static void reverseAllCols(int[][] mat)
    {
        for (int x = 0; x < mat.length/2; x++) {
            for (int y = 0; y < mat[0].length; y++) {
                int temp = mat[x][y];
                mat[x][y] = mat[mat.length -1 -x][y];
                mat[mat.length -1 -x][y] = temp;  
            }
        }
    }

    public static void reverseMatrix(int[][] mat) {
        /* to be implemented in part (c) */ 
        reverseAllRows(mat); 
        reverseAllCols(mat);
    }

    public static void printMatrix(int[][] mat) {
        for (int[] x : mat) {
            for (int y : x) {
                System.out.print(y + " ");
            }
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        int[][] mat1 = { 
                        { 1, 2, 3, 4 }, 
                        { 5, 6, 7, 8 }, 
                        { 9, 10, 11, 12 } 
                    };
        //reverseAllRows(mat1);

        int[][] mat2 = {
                        { 1, 2 },
                        { 3, 4 },
                        { 5, 6 }
                    };
        reverseMatrix(mat2);
        printMatrix(mat2);
    }
}