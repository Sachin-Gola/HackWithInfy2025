import java.util.Arrays;
public class CoinExchange{
    public static void main(String[] args) {
        int[] coins={9,5,1,4};
        Arrays.sort(coins);
        int amount=11;
        int[] dp=new int[amount+1];
        Arrays.fill(dp,amount+1);
        dp[0]= 0;
        for(int i=1;i<dp.length;i++){
            for(int j=0;j<coins.length;j++){
                if(coins[j]<=i) dp[i]=Math.min(dp[i],dp[i-coins[j]]+1);
            }
        }
        if(dp[amount]>amount) System.out.println(-1);
        else System.out.println(dp[amount]);
        
    
  }

}

