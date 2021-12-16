/**
 * class Square3x3 represents a 2d 3x3 squared array
 * 
 * @author Itiel Aharonson
 */
public class Square3x3 {
    // declarations
    private int[][] _s3x3 = new int[3][3];
    private final int DEFAULT_VALUE = -1;

    /**
     * Constructor for objects of class Square3x3
     * Constructs a new Square3x3 with the DEFAULT_VALUE (-1) in every square
     */
    public Square3x3() {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                _s3x3[i][j] = DEFAULT_VALUE;
    }

    /**
     * Constructor for objects of class Square3x3
     * Constructs a new Square3x3 each square fiiled with the given array's values,
     * if array's lines are shorters or missing,
     * puts DEFAULT_VALUE (-1) intead.
     * 
     * @param array is the given array
     */
    public Square3x3(int[][] array) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i < array.length && j < array[i].length) {
                    _s3x3[i][j] = array[i][j];
                } else
                    _s3x3[i][j] = DEFAULT_VALUE;
            }
        }
    }

    /**
     * Copy constructor. Constructs a 2-dimensional array of the size 3X3, whose
     * values are
     * taken from a given Square3x3 object.
     *
     * @param other - the given Square3x3 object
     */
    public Square3x3(Square3x3 other) {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                _s3x3[i][j] = other._s3x3[i][j];
    }

    /**
     * Returns the value in the (row, col) cell.
     * If the row and/or col are out of the array bounds, returns –1.
     * Legal values for row/col are 0,1,2.
     * 
     * @param row is the cell's row in the 3x3 Square
     * @param col is the cell's column in the 3x3 Square
     */
    public int getCell(int row, int col) {
        if (row < 3 && col < 3)
            return _s3x3[row][col];
        else
            return -1;
    }

    /**
     * Sets the cell (row, col) in the array to the given value.
     * If the row and/or col are out of the array bounds – does nothing.
     * Legal values for row/col are 0,1,2.
     * 
     * @param row   is the cell's row in the 3x3 Square
     * @param col   is the cell's column in the 3x3 Square
     * @param value is the value to set in the cell
     */
    public void setXY(int row, int col, int value) {
        if (row < 3 && col < 3)
            _s3x3[row][col] = value;

    }

    /**
     * Returns a String representation of the array.
     */
    public String toString() {
        return _s3x3[0][0] + "\t" + _s3x3[0][1] + "\t" + _s3x3[0][2] + "\n" +
                _s3x3[1][0] + "\t" + _s3x3[1][1] + "\t" + _s3x3[1][2] + "\n" +
                _s3x3[2][0] + "\t" + _s3x3[2][1] + "\t" + _s3x3[2][2] + "\n";
    }

    public String toString(int row) {
        return _s3x3[row][0] + "\t" + _s3x3[row][1] + "\t" + _s3x3[row][2];

    }

    /**
     * return true if a given number is in an 3x3 square
     *
     * @param number is the given number
     * @param s3x3   is the square
     */
    private boolean check(int[][] s3x3, int number) {
        for (int i = 0; i < 3; i++) { // goes trough the rows
            for (int value : s3x3[i]) { // goes trough the value of every coulun in the i row,
                if (value == number) // and return true if finds the number
                    return true;
            }
        }
        // number is not in the square
        return false;
    }

    /**
     * returns true if numbers 1-9 are all in the 3x3 array
     */
    public boolean allThere() {
        for (int num = 1; num <= 9; num++) {
            if (!check(_s3x3, num))// if one of the numbers is not found return false
                return false;
        }
        // all numbers are found
        return true;
    }

    /**
     * gets a boolean array with 10 cells initilized to false.
     * sets to true the cells 1-9 with the same index as the numbers in a given row
     * (if one of the numbers in the given row is not 1-9, sets cell 0 to true)
     * 
     * @param row is the given row
     * @param r   is the boolean array
     */
    public void whosThereRow(int row, boolean[] r) {
        // if (row < 3) {// row is a valid row
        // for (int i = 0; i < 3; i++) {
        // int num = _s3x3[row][i];
        // values[(num >= 1 && num <= 9) ? num : 0] = true;// if num is 1-9, marks its
        // cell as true, else,
        // // just marks cell 0 :))
        // }
        // }
    }

    /**
     * gets a boolean array with 10 cells initilized to false.
     * sets to true the cells 1-9 with the same index as the numbers in a given
     * column
     * (if one of the numbers in the given column is not 1-9, sets cell 0 to true)
     * 
     * @param col    is the given row
     * @param values is the boolean array
     */
    public void whosThereCol(int col, boolean[] values) {
        if (col < 3) {// col is a valid column
            for (int i = 0; i < 3; i++) {
                int num = _s3x3[i][col];
                values[(num >= 1 && num <= 9) ? num : 0] = true;// if num is 1-9, marks its cell as true, else,
                                                                // just marks cell 0 :))
            }
        }
    }

    ///////////////////////////////

}
