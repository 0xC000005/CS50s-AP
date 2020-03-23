public class ColorGrid {
    private String[][] pixels;
    private int rows;
    private int cols;

    /**
     * Creates numRows × numCols ColorGrid from String s.
     * 
     * @param s       the string containing colors of the ColorGrid
     * @param numRows the number of rows in the ColorGrid
     * @param numCols the number of columns in the ColorGrid
     */
    public ColorGrid(String s, int numRows, int numCols) {
        /* to be implemented in part (a) */
        rows = numRows;
        cols = numCols;
        pixels = new String[rows][cols];
        int stringIndex = 0;
        for (int x = 0; x < rows; x++) {
            for (int y = 0; y < cols; y++) {
                pixels[x][y] = s.substring(stringIndex, stringIndex + 1);
            }
        }
    }

    /**
     * Precondition: - pixels[row][col] is oldColor, one of "r", "b","g", or "y". -
     * newColor is one of "r","b","g", or "y". Postcondition: - If 0 <= row < rows
     * and 0 <= col < cols, paints the * connected region of pixels[row][col] the
     * newColor. - Does nothing if oldColor is the same as newColor.
     * 
     * @param row      the given row
     * @param col      the given column
     * @param newColor the new color for painting
     * @param oldColor the current color of pixels[row][col]
     */
    public void paintRegion(int row, int col, String newColor, String oldColor) {
        /* to be implemented in part (b) */ 
        if((row>=0&&row<rows)&&(col>=0&&col<cols))
        {
            if((pixels[row][col].equals(oldColor))&&(!pixels[row][col].equals(newColor)))
            {
                pixels[row][col] = newColor;
                paintRegion(row+1, col, newColor, oldColor);
                paintRegion(row-1, col, newColor, oldColor);
                paintRegion(row, col+1, newColor, oldColor);
                paintRegion(row, col-1, newColor, oldColor);
            }
        }
    } // Other methods are not shown.
}