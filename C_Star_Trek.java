import java.util.*;
public class C_Star_Trek {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int coin=sc.nextInt();
            int[] arr=new int[n];
            int[] cost=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                cost[i]=arr[i]+(i+1);
            }

            Arrays.sort(cost);
            int cnt=0;
            for(int i=0;i<n;i++){
                if(coin>=cost[i]){
                    coin-=cost[i];
                    cnt++;
                }
                else {
                    break;
                }
            }
            System.out.println(cnt);
            
            
        }
        
    }
}