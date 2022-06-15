public class Slc348 {
    int[] rows;
    int[] cols;
    int diag;
    int antidiag;

    public Slc348(int n) {
        rows = new int[n];
        cols = new int[n];
    }

    public int move (int row, int col, int player) {
        int currentplayer = (player == 1) ? 1 : -1 ;

        rows[row] += currentplayer;
        cols[col] += currentplayer;
        
        int n = rows.length;
        if (row == col) { diag += currentplayer;}
        if (row == n-1-col) {antidiag += currentplayer;}

        if (Math.abs(rows[row]) == n ||
            Math.abs(cols[col]) == n ||
            Math.abs(diag) == n ||
            Math.abs(antidiag) == n
        ) {
            return player;
        }
        return 0;
    }
}
