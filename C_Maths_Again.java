import java.util.*;
public class C_Maths_Again{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int min=Integer.MAX_VALUE;
        if (n <= 0) {
        System.out.println(0);
          return;
        }

       
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            min=Math.min(min,arr[i]);
        }
        int cnt=0;
        for(int i=1;i<=min;i++){
            int len=0;
            for(int j=0;j<n;j++){
                if(arr[j]%i==0){
                    len++;
                }
            }
            if(len==n){
                cnt++;
            }
        }

        System.out.println(cnt);



    }
}