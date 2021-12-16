
/**
 * class Sudoku represents a soduko square, using 2d array array of Square3x3
 * objects
 * 
 * @author Itiel Aharonson
 */
public class Sudoku {
    // declarations
    private Square3x3[][] _sudoku = new Square3x3[3][3];

    /**
     * Constructor for objects of class Sudoku
     * Constructs a new Sudoku with the DEFAULT_VALUE of Square3x3 (-1) in every
     * square
     */
    public Sudoku() {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                _sudoku[i][j] = new Square3x3();
    }

    /**
     * Constructs a Sudoku object
     * with the same values as a given 2d [3][3]array of Square3x3 objects.
     *
     * @param square3x3Array - the given array
     */
    public Sudoku(Square3x3[][] square3x3Array) {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                _sudoku[i][j] = new Square3x3(square3x3Array[i][j]);
    }

    /**
     * public Boolean isValid(){
     * for (int i = 0; i < 3; i++)
     * for (int j = 0; j < 3; j++){
     * if(!(isRoeColValid()&& _sudoku[i][j].allThere()))
     * return false;
     * }
     * }
     * return true;
     * }
     */
    /*
     * private Boolean isRoeColValid(){
     * 
     * for (int i = 0; i < 3; i++)
     * for(int row=0;row<3;row++){
     * Boolean [] values = new Boolean[9];
     * for (int c = 0; c < 3; c++){
     * int array[][] = {
     * { 2, 1, 5 },
     * { 4, -1, 9 },
     * { 3, 6, 7 }
     * };
     * Square3x3 y = new Square3x3((array);
     * y.whosThereRow(row,values);
     * }
     * }
     * 
     * }
     * 
     * /**
     * Returns a String representation of the Sudoku.
     */

    public String toString() {
        return _sudoku[0][0].toString(0) + "\t\t" + _sudoku[0][1].toString(0) + "\t\t" + _sudoku[0][2].toString(0)
                + "\n\n" +
                _sudoku[0][0].toString(1) + "\t\t" + _sudoku[0][1].toString(1) + "\t\t" + _sudoku[0][2].toString(1)
                + "\n\n" +
                _sudoku[0][0].toString(2) + "\t\t" + _sudoku[0][1].toString(2) + "\t\t" + _sudoku[0][2].toString(2)
                + "\n\n\n" +
                _sudoku[1][0].toString(0) + "\t\t" + _sudoku[1][1].toString(0) + "\t\t" + _sudoku[1][2].toString(0)
                + "\n\n" +
                _sudoku[1][0].toString(1) + "\t\t" + _sudoku[1][1].toString(1) + "\t\t" + _sudoku[1][2].toString(1)
                + "\n\n" +
                _sudoku[1][0].toString(2) + "\t\t" + _sudoku[1][1].toString(2) + "\t\t" + _sudoku[1][2].toString(2)
                + "\n\n\n" +
                _sudoku[2][0].toString(0) + "\t\t" + _sudoku[2][1].toString(0) + "\t\t" + _sudoku[2][2].toString(0)
                + "\n\n" +
                _sudoku[2][0].toString(1) + "\t\t" + _sudoku[2][1].toString(1) + "\t\t" + _sudoku[2][2].toString(1)
                + "\n\n" +
                _sudoku[2][0].toString(2) + "\t\t" + _sudoku[2][1].toString(2) + "\t\t" + _sudoku[2][2].toString(2);

    }

    // main
    public static void main(String[] args) {
        int x[][] = {
                { 2, 1, 5 },
                { 4, 8, 9 },
                { 3, 6, 7 }
        };

        int y[][] = {
                { 9, 4, 7 },
                { 1, 8, 2 },
                { 6, 3, 5 }
        };

        int z[][] = {
                { 2, 8, 6 },
                { 9, 4, 3 },
                { 7, 1, 5 }
        };

        Square3x3[][] sq = new Square3x3[3][3];
        sq[0][0] = new Square3x3(x);
        sq[0][1] = new Square3x3(y);
        sq[0][2] = new Square3x3(z);
        sq[1][0] = new Square3x3(z);
        sq[1][1] = new Square3x3(x);
        sq[1][2] = new Square3x3(y);
        sq[2][0] = new Square3x3(y);
        sq[2][1] = new Square3x3(z);
        sq[2][2] = new Square3x3(x);

        Sudoku a = new Sudoku(sq);

        System.out.println(a);
        Boolean[] values = new Boolean[9];
        Square3x3 asd = a._sudoku[0][0];
        asd.whosThereRow(1, values);
        // System.out.println("boolean [] row" + row + " check ");
        // for (int i = 0; i < 10; i++)
        // System.out.println(Boolean.toString(i));

    }

}
