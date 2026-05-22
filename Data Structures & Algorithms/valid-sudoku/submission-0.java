class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n = board.length;
        int index = 0;
        Map<Character, Integer>[] map = new HashMap[n*3];

        //rows
        for (int i = 0; i < n; i++) {
            map[index] = new HashMap<>();
            for (int j = 0; j < n; j++) {
                 if (Character.isDigit(board[i][j])) {
                    map[index].put(board[i][j], 
                        map[index].getOrDefault(board[i][j],0)+1
                    );
                    if (map[index].get(board[i][j]) > 1) return false;
                 }
            }
            index++;
        }

        //cols
        for (int i = 0; i < n; i++) {
            map[index] = new HashMap<>();
            for (int j = 0; j < n; j++) {
                 if (Character.isDigit(board[j][i])) {
                    map[index].put(board[j][i], 
                        map[index].getOrDefault(board[j][i],0)+1
                    );
                    if (map[index].get(board[j][i]) > 1) return false;
                 }
            }
            index++;
        }

        for (int square = 0; square < n; square++) {
            map[index] = new HashMap<>();
            
            // Find where this 3x3 block begins
            int boxRowStart = (square / 3) * 3;
            int boxColStart = (square % 3) * 3;
            
            // Iterate through the 3 rows and 3 columns of this specific block
            for (int r = 0; r < 3; r++) {
                for (int c = 0; c < 3; c++) {
                    char currentVal = board[boxRowStart + r][boxColStart + c];
                    
                    if (Character.isDigit(currentVal)) {
                        map[index].put(
                            currentVal, 
                            map[index].getOrDefault(currentVal, 0) + 1
                        );
                        
                        // If we see it a second time, it's invalid
                        if (map[index].get(currentVal) > 1) return false;
                    }
                }
            }
            index++;
        }

        return true;
    }
}
