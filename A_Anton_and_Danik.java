import java.util.*;
public class A_Anton_and_Danik
{
    public static void main (String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        String str=sc.next();

        int cnt=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='A'){
               
                cnt++;
            }
        }
     
        int count=t-cnt;

        if(cnt>count){
            System.out.println("Anton");
        }else if(cnt<count){
            System.out.println("Danik");
        }else if(cnt==count){
            System.out.println("Friendship");
        }

    }
}