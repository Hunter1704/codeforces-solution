import java.util.*;


public class B_X_Axis
{
	public static void main (String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int[] arr=new int[3];
		while(t-->0){
		    for(int i=0;i<3;i++){
		        arr[i]=sc.nextInt();
		    }
		    
		    int min=Integer.MAX_VALUE;
		for(int x:arr){
		    int y=Math.abs(arr[0]-x)+Math.abs(arr[1]-x)+Math.abs(arr[2]-x);
		    min=Math.min(min,y);
	    }
	    
	    System.out.println(min);
		
		
		}
		
		
		

	}
}