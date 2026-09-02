
import java.util.Arrays;

public class Climbing_Stairs {
    // memoization
    public static int countWays(int n, int dp[]){
        if(n==0){
            return 1;
        }
        if(n<0){
            return 0;
        }
        if(dp[n] != -1){
            return dp[n];
        }
        dp[n] = countWays(n-1, dp)+countWays(n-2, dp);
        return dp[n];
    }

    // tabulation
    // create table + initilize
    // meaning of index
    // fill(small to large)
    public static int countWaysTab(int n){
        int dp[] = new int[n+1];
        dp[0] = 1;

        // tabulation loop
        for(int i =1;i<= n;i++){
            if(i==1){
                dp[i]= dp[i-1]+0;
            }else{
                dp[i] = dp[i-1]+ dp[i-2];
            }
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n = 5;
        int dp[] = new int[n+1];
        Arrays.fill(dp, -1);
        System.out.println(countWays(n, dp));
        System.out.println(countWaysTab(n));        

    }
}
