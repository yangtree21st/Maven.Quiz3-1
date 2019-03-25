package rocks.zipcode.io.quiz3.arrays;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {
    private String[][] board;
    public TicTacToe(String[][] board) {
        this.board = board;
    }

    public TicTacToe() {
    }

    public String[] getRow(Integer value) {

        return board[value];
    }

    public String[] getColumn(Integer value) {
        return new String[]{board[0][value],board[1][value],board[2][value]};
    }

    public Boolean isRowHomogenous(Integer rowIndex) {
        return board[rowIndex][0] == board[rowIndex][1] && board[rowIndex][1] == board[rowIndex][2]
                && board[rowIndex][0] == board[rowIndex][2];
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {
       return board[0][columnIndex] == board[1][columnIndex] && board[1][columnIndex] == board[2][columnIndex]
                && board[0][columnIndex] == board[2][columnIndex];
    }

    public boolean isDiagonalHomogeneous(){
       if(board[0][0]!= null && board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
           return true;
       }
       else if (board[0][2]!= null && board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
           return true;
       }
       return false;
    }

    public String getWinner() {
        String winner= "";

        for(int i=0;i<3;i++ ){
            if (isRowHomogenous(i)){
                winner = board [i][0];}
            else if (isColumnHomogeneous(i) ){
                winner = board [0][i];
            }
            else if ( isDiagonalHomogeneous())
                winner = board[1][1];

        }
        return winner;
    }

    public String[][] getBoard(){
        return board;
    }
}
