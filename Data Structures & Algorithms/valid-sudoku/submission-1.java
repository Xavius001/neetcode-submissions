class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> seen = new HashSet<>();
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[r].length; c++) {
                char val = board[r][c];
                
                // 1. Skip empty spaces completely
                if (val == '.') {
                    continue;
                }
                
                // 2. Generate unique signatures and check for collisions
                // Short keys reduce string creation overhead!
                if (!seen.add(val + "r" + r) ||
                    !seen.add(val + "c" + c) ||
                    !seen.add(val + "b" + (r / 3) + "-" + (c / 3))) {
                    return false; 
                }
            }
        }
        return true;
    }
}
