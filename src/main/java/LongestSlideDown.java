/**
 * Created by trankhai on 9/20/17.
 */
public class LongestSlideDown {
    public static int longestSlideDown(int[][] pyramid) {
        for (int layer = pyramid.length -2 ; layer >= 0; layer --) {
            int[] underLayer = pyramid[layer + 1];
            int[] currentLayer = pyramid[layer];
            for (int index = 0; index < currentLayer.length;index++) {
                currentLayer[index] += (underLayer[index] > underLayer[index+1]) ? underLayer[index] : underLayer[index+1];
            }
        }
        return pyramid[0][0];
    }
}
