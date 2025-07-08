import java.util.Arrays;
public class CoinExchange{
    public static void main(String[] args) {
        int[] arr={9,5,1,4};
        Arrays.sort(arr);
        int amount=4;
        int[] cp=new int[amount+1];
        int[] sp=new int[amount+1];

        cp[0]=0;
        sp[0]=0;
        for (int p = 1; p <= amount; p++) {
            int minCoinsRequired = Integer.MAX_VALUE;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] <= p && cp[p - arr[i]] != Integer.MAX_VALUE) {
                    if (cp[p - arr[i]] + 1 < minCoinsRequired) {
                        minCoinsRequired = cp[p - arr[i]] + 1;
                        sp[p] = arr[i]; 
                    }
                }
            }
            cp[p] = minCoinsRequired;
        
    }
    System.out.println( cp[cp.length-1]);
  }

}

