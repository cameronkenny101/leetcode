public class QuadraticSolution {

    public int maxArea(int[] height) {
        int area = 0;
        int maxArea = 0;

        for(int i = 0; i < height.length; i++) {
            for(int j = i + 1; j < height.length; j++) {
                int boxHeight = Math.min(height[i], height[j]);
                area = boxHeight * (j - i);
                if(area > maxArea)
                    maxArea = area;
            }
        }

        return maxArea;
    }
}
