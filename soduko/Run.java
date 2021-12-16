public class Run {
    // main
    public static void main(String[] args) {
        int array[][] = {
                { 2, 1, 5 },
                { 4, -1, 9 },
                { 3, 6, 7 }
        };

        Square3x3 x = new Square3x3(array);
        Square3x3 y = new Square3x3(x);
        x.setXY(1, 1, 4);
        System.out.println(x);
        System.out.println(y);
        System.out.println(x.allThere());
        System.out.println(x.toString(1));

        boolean[] r = new boolean[10];
        boolean[] c = new boolean[10];

        int row = 1;
        System.out.println("boolean [] row" + row + " check ");
        x.whosThereRow(1, r);
        for (int i = 0; i < 10; i++)
            System.out.println(Boolean.toString(r[i]));
        int column = 1;
        y.whosThereCol(1, c);
        System.out.println("boolean [] column" + column + " check ");
        for (int i = 0; i < 10; i++)
            System.out.println(Boolean.toString(c[i]));

    }
}
