import java.util.*;

public class MinimumNumberOfCoins {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        int n = sc.nextInt();
        int[] coins = new int[n];
        for (int i = 0; i < n; i++) {
            coins[i] = sc.nextInt();
        }

        System.out.println(coinChange(coins, amount));
    }

    public static int coinChange(int[] coins, int amount) {
        Arrays.sort(coins);
        int count = 0;
        int currCoin = coins.length - 1;
        while (amount > 0 && currCoin >= 0) {
            if (coins[currCoin] <= amount) {
                amount -= coins[currCoin];
                count++;
            } else {
                currCoin--;
            }
        }
        if(amount==0) return count;
        return -1;
        
    }
}
