import java.util.ArrayList;

public class TicTacToe {
    private ArrayList<ArrayList<Integer>> graph;

    /** 
     * Constructor of the TicTacToe
     * Initializes the board with size of n
     */
    public TicTacToe(int n) {
        this.graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                row.add(0);
            }
            this.graph.add(row);
        }
    }

    public int move(int row, int col, int player) {
        this.graph.get(row).set(col, player);
        if (checkWin(row, col, player)) {
            return player;
        }
        return 0;
    }

    private boolean checkWin(int row, int col, int player) {
         // Marks the board with players number
        boolean rowWin = true;
        for (int i = 0; i < this.graph.size(); i++) {
            if (this.graph.get(row).get(i) != player) {
                rowWin = false;
                break;
            }
        }
        // Check if current col is a valid outcome
        boolean colWin = true;
        for (int i = 0; i < this.graph.size(); i++) {
            if (this.graph.get(i).get(col) != player) {
                colWin = false;
                break;
            }
        }
        // Check if diagonal is a valid outcome
        boolean winDiag = true;
        for (int i = 0; i < this.graph.size(); i++) {
            if (this.graph.get(i).get(i) != player) {
                winDiag = false;
                break;
            }
        }
        // Check if anti-diagonal is a valid outcome
        boolean winAntiDiag = true;
        for (int i = 0; i < this.graph.size(); i++) {
            if (this.graph.get(i).get(this.graph.size() - 1 - i) != player) {
                winAntiDiag = false;
                break;
            }
        }

        return rowWin || colWin || winDiag || winAntiDiag;
    }

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe(3);
        System.out.println(game.move(0, 0, 1)); // Player 1 moves
        System.out.println(game.move(0, 1, 2)); // Player 2 moves
        System.out.println(game.move(1, 1, 1)); // Player 1 moves
    }
}
