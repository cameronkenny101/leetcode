public class maxPop {

    public int maximumPopulation(int[][] logs) {
        int[] year = new int[100];
        for(int i = 0; i < logs.length; i++) {
            for(int j = logs[i][0] - 1950; j < logs[i][1] - 1950; j++) {
                year[j]++;
            }
        }

        int max = 0;
        for(int i = 0; i < year.length; i++) {
            if(year[i] > year[max]) {
                max = i;
            }
        }
        return max + 1950;
    }
}
