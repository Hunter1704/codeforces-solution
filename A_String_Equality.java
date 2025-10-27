import java.util.Scanner;

public class A_String_Equality {
    	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String s= sc.nextLine();
		String t= sc.nextLine();
	 int ans=0;
     int i=s.length()-1;
     int j=t.length()-1;

     while(i>=0 && j>=0){
        if(s.charAt(i)==t.charAt(j)){
          i--;
          j--;
        }
        else{
          
            break;
        }
       

     }
     ans+=i+j+2;

     System.out.println(ans);




	}

}
