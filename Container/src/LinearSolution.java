public class LinearSolution {
    
    public int maxArea(int[] height) {
        int area = 0;
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;

        while(left != right) {
            area = Math.min(height[left], height[right]) * (right - left);
            if(area > maxArea)
                maxArea = area;
            if(height[left] > height[right])
                right--;
            else
                left++;
        }
        return maxArea;
    }
}
