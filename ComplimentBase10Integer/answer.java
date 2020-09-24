class Solution {
    public int bitwiseComplement(int N) {
        if(N == 0) {
            return 1;
        }
        int index = 0;
        int[] binary = new int[40];
        while(N > 0) {
            binary[index++] = N % 2;
            N /= 2;
        }
        
        for(int i = index-1;i >= 0;i--){
            if(binary[i] == 0) {
                binary[i] = 1;
            } else 
                binary[i] = 0;
        }
        
        int ans = 0;
        int power = 2;
        for(int i = 0; i < index; i++){
            if(binary[i] == 1) {
                ans += power;
            }
            if(i >= 1) {
                power *= 2;
            }
        }
        if(binary[0] == 1) {
            ans -= 1;
        } 
        
        return ans;
    }
}