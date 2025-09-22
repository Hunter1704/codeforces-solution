import java.util.*;
public class A_Array_Coloring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
            
            int sum=0;
            for(int j=0;j<n/2;j++){
                sum+=arr[n-1-j]-arr[j];
            }
            System.out.println(sum);
        }
        
    }
}