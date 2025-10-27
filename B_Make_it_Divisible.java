import java.util.*;
public class B_Make_it_Divisible{

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        while(t-->0){
            int n=sc.nextInt();

            int c0=0;
            int c1=0;
            int c2=0;
            int[] arr=new int[n];

            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                int rem=arr[i]%3;
                if(rem==0) c0++;
                else if(rem==1) c1++;
                else{
                    c2++;
                }
            }

            int make=Math.min(c1,c2);
            int left=Math.abs(c1-c2);
            int ans=0;
             ans+=c0+make+left/3;
            System.out.println(ans);


        }

    }

}