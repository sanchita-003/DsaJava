public class SudokuSolver {
    public static void main(String[] args) {
        int[][] board = {
                {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0}
        };

        if(solve(board)){
            display(board);
        }
        else{
            System.out.println("Cannot solve!!");
        }
    }
    
    static boolean solve(int[][] board){
        int r = -1;
        int c = -1;
        boolean isFull = true;
        for(int i = 0 ; i < board.length ; i++){
            for(int j = 0 ; j < board[0].length ; j++){
                if(board[i][j] == 0){
                    r = i;
                    c = j;
                    isFull = false;
                    break;
                }
            }
            if(!isFull){
                break;
            }
        }

        if(isFull){
            return true;
        }
        for(int number = 1 ; number <= 9 ; number++){
            if(isSafe(board , r , c , number)){
                board[r][c] = number;
                if(solve(board)){
                    return true;
                }
                else{
                    board[r][c] = 0;
                }
            }
        }
        return false;
    }

    static boolean isSafe(int[][] board , int row , int col , int number){
        //row
        for(int i = 0 ; i < board.length ; i++){
            if(board[row][i] == number){
                return false;
            }
        }

        //col
        for(int i = 0 ; i < board.length ; i++){
            if(board[i][col] == number){
                return false;
            }
        }

        //diagonal
        int sqrt = (int)(Math.sqrt(board.length));
        int rowstart = row-row%sqrt;
        int colstart = col-col%sqrt;
        for(int i = rowstart ; i < rowstart+sqrt ; i++){
            for(int j = colstart ; j < colstart+sqrt ; j++){
                if(board[i][j] == number){
                    return false;
                }
            }
        }
        return true;
    }

    static void display(int[][] board){
        for(int i = 0 ; i < board.length ; i++){
            for(int j = 0 ; j < board[0].length ; j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
}