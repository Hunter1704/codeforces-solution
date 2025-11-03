import java.util.Scanner;

public class B_Maths{

    public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     int t=sc.nextInt();
      

      
     while(t-->0){
        long n=sc.nextLong();
        boolean flag=false;

        
       

        long i=1;
        long j=(long)Math.cbrt(n);
        while(i<=j){
            long sum=i*i*i+j*j*j;
            if(sum==n){
                flag=true;
                break;
            }
            else if(sum<n){
                i++;
            }
            else{
                j--;
            }
        }

        System.out.println(flag ? "YES" : "NO");

    

        
     }

    
    



    }
}