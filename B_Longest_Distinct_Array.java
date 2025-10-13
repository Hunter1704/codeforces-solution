import java.util.*;
public class B_Longest_Distinct_Array{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();


        while(t-->0){
            int n=sc.nextInt();

            int[] arr=new int[n];
            for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            }
            HashSet<Integer> hs=new HashSet<>();

            for(int i=0;i<arr.length;i++){
                hs.add(arr[i]);
            }
            int k=hs.size();
            if((n-k)%2==0)System.out.println(k);
            else{
                System.out.println(k-1);
            }
        }
    }
}