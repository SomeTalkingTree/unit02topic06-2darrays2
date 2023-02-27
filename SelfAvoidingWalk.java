public class SelfAvoidingWalk {
    public static boolean doAWalk(int dimension) {
        boolean[][] grid = new boolean[dimension][dimension];

        int x = dimension / 2;
        int y = dimension / 2;

        while (
            x >= 0 && x < dimension &&
            y >= 0 && y < dimension &&
            grid[x][y] == false
        ) {
            grid[x][y] = true;
            int lastpos =0;
            double r = Math.random();
            if (r < 0.25) {
                if(lastpos!=1){
                // up
                y = y - 1;lastpos=1;}
            } else if (r < .5) {
                if(lastpos!=2){lastpos=2;y = y + 1;}
                // down
            } else if (r < .75) {
                if(lastpos!=3){lastpos=3;x = x - 1;}
                // left
            } else {
                if(lastpos!=3){lastpos=3;x = x + 1;}
                // right
            }
        }

        if (x < 0 || x >= dimension ||
            y < 0 || y >= dimension) {
            return true;
        } else {
            return false;
        }
    }

    public static void printGrid(boolean[][] grid) {

        //should and try to make my own code for this

        int nRows = grid.length;
        int nCols = grid[0].length;

        for (int c = 0; c < nCols + 2; c++) {
            System.out.print("-");
        }
        System.out.println();

        for (int r = 0; r < nRows; r++) {
            System.out.print("|");
            for (int c = 0; c < nCols; c++) {
                if (grid[r][c] == true) {
                    System.out.print(".");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("|");
        }

        for (int c = 0; c < nCols + 2; c++) {
            System.out.print("-");
        }
        System.out.println();
    }
    public static void main(String[] args) {

        //make my own code for this

        /*int dim = 10;
        int trials = 10000;
        int nEscapes = 0;
        for (int t = 0; t < trials; t++) {
            if (doAWalk(dim) == true) {
                nEscapes++;
            }        
        }
        System.out.println("Did " + trials + " trials");
        System.out.println("Escaped " + nEscapes + " times");
        System.out.println("Probability of escape is " + (double) nEscapes / trials);*/
    }
}
