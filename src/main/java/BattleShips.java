import java.util.*;
/**
 * Created by trankhai on 9/18/17.
 * Kata link: https://www.codewars.com/kata/58d06bfbc43d20767e000074
 */
public class BattleShips {
    public static Map<String,Double> damagedOrSunk(final int[][] board, final int[][] attacks) {
        HashMap<Integer, Integer> boatLengthMap = new HashMap<>();
        HashMap<Integer, Integer> boatAttackedMap = new HashMap<>();

        for (int i=0;i<board.length;i++)
            for (int j=0;j<board[0].length;j++) {
                int val = board[i][j];
                if (val != 0) {
                    Integer cnt = boatLengthMap.get(val);
                    if (cnt == null)
                        boatLengthMap.put(val, 1);
                    else
                        boatLengthMap.replace(val, cnt + 1);
                }
            }

        for (int[] attack : attacks) {
            int boatId = getAttackedBoatId(board, attack);
            Integer attackedTime = boatAttackedMap.get(boatId);
            if (attackedTime == null)
                boatAttackedMap.put(boatId, 1);
            else
                boatAttackedMap.put(boatId, attackedTime + 1);
        }

        int sunk = 0;
        int damaged = 0;
        int notTouched = 0;
        float points = 0;
        for (Integer boatId : boatLengthMap.keySet()){
            Integer attackedTimes = boatAttackedMap.get(boatId);
            if (attackedTimes == null) {
                notTouched++;
                points-=1;
            } else {
                if (attackedTimes == boatLengthMap.get(boatId)) {
                    sunk++;
                    points += 1;
                }
                if (attackedTimes < boatLengthMap.get(boatId)) {
                    damaged++;
                    points += 0.5;
                }
            }
        }

        HashMap<String, Double> result = new HashMap<>();
        result.put("sunk", (double) sunk);
        result.put("damaged", (double) damaged);
        result.put("notTouched", (double) notTouched);
        result.put("points", (double) points);

        return result;
    }

    private static int getAttackedBoatId(int[][] board, int[] attack){
        int[] attackPosition = projection(attack[0],attack[1],board[0].length,board.length);
        if (attackPosition == null)
            return -1;
        return board[attackPosition[1]][attackPosition[0]];
    }

    private static int[] projection(int x, int y, int sizeX, int sizeY){
        if (x > sizeX || y > sizeY || x < 1 || y < 1)
            return null;
        return new int[] {x - 1, sizeY - y};
    }

}
