package programmers.level1;

import java.util.ArrayList;

public class _64061 {
    public int solution(int[][] board, int[] moves) {
        ArrayList<Integer> basket = new ArrayList<>();
        for(int move: moves) {
            for(int i = 0; i < board[0].length; i++) {
                if (board[i][move - 1] != 0) {
                    basket.add(board[i][move - 1]);
                    board[i][move - 1] = 0;
                    break;
                }
            }
        }
        int firstSize = basket.size();

        overlabCheck(basket);
        return firstSize - basket.size();
    }

    private void overlabCheck(ArrayList<Integer> basket) {
        boolean recu = false;
        for (int i = 0; i < basket.size(); i++) {
            if (basket.size() - 1 > i &&
                    basket.get(i) == basket.get(i + 1)) {
                basket.remove(i);
                basket.remove(i);
                recu = true;
            }

        }
        if (recu)
            overlabCheck(basket);
    }
}
