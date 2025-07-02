import java.util.*;

public class MaxServings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while ((t-->0)) {
            int n=sc.nextInt();
            int[] dishes=new int[n];
            HashMap<Integer,Integer> map=new HashMap<>();
            for(int i=0;i<n;i++){
                int a=sc.nextInt();
                dishes[i]=a;
                map.put(a,0);
                
            }
            for(int i:map.keySet()){
                map.put(i,findMax(dishes,i));
            }
            int maxVal=0;
            int key=0;
            for(int i:map.keySet()){
                if(map.get(i)>maxVal){
                    maxVal=map.get(i);
                    key=i;
                }
                else if(map.get(i)==maxVal){
                    key=Math.min(i,key);
                }
            }

            System.out.println(key);

            
            
        }
    }
    public static int findMax(int[] dishes,int type){
        int count=0;
        for(int i=0;i<dishes.length;){
           if(dishes[i]==type){
              count++;
              i+=2;
           }
           else i++;
           
        }
        return count;
    }
}
