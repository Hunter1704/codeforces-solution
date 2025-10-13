import java.util.*;
 
public class C_Split_the_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n=sc.nextInt();
            String s=sc.next();
            
            int[] pre = new int[n];
            int[] suf = new int[n];
            HashSet<Character> hs = new HashSet<>();
            for (int i=0;i<n;i++) {
                hs.add(s.charAt(i));
                pre[i] = hs.size();
            }
            hs.clear();
            for (int i=n-1;i>=0;i--) {
                hs.add(s.charAt(i));
                suf[i] = hs.size();
            }
            int ans = 0;
            for (int i=0;i<n-1;i++) {
                ans = Math.max(ans,pre[i]+suf[i+1]);
            }
            
            System.out.println(ans);
        }
    }
}
