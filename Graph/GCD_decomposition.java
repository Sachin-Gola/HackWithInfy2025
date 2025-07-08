package HackWithInfy2025.Graph;

import java.util.*;

public class GCD_decomposition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(sc.nextInt());
        }
        if(set.size()<2){ System.out.println("No"); return;}
        List<Integer> num=new ArrayList<>();

        // Building graph:
        List<List<Integer>> adj=new ArrayList<>();
        for (int i = 0; i < num.size(); i++) {
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<num.size();i++){
            for(int j=i+1;j<num.size();j++){
                int a=num.get(i);
                int b=num.get(j);
                if(GCD(a, b)==1){
                    adj.get(i).add(j);
                    adj.get(j).add(i);

                }
            }
        }
        if(isBipartite(adj)) System.out.println("YES");
         else System.out.println("NO");

    }

    public static int GCD(int a,int b){
        while(a%b!=0){
            int rem=a%b;
            a=b;
            b=rem;
        }
        return b;
    }
    public static boolean isBipartite(List<List<Integer>> adj){
        
        return true;
    }
}
