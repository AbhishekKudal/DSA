// Fibonnaci Series: 

class Solution {
    public int climbStairs(int n) {
        int n1 = 1;
        int n2 =2 ;
        int ans = 0;

        if(n == 0){
            return 0;
        }

        if(n == 1){
            return 1;
        }

        if(n == 2){
            return 2;
        }
        for(int i = 2; i< n; i++){
            ans = n1 + n2;
            n1 = n2;
            n2 = ans;
        }

        return ans;
    }
}
