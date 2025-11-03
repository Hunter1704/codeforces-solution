import java.util.*;
 
public class A_Sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ArrayList<Character>> x = new ArrayList<>();
        int m = 0;
 
        while(n-->0) {
            String s = sc.next();
            m = Math.max(m, s.length());
            ArrayList<Character> list = new ArrayList<>();
            for (int j = 0; j < s.length(); j++) {
                list.add(s.charAt(j));
            }
            x.add(list);
        }
 
        for (int i = 0; i < m; i++) {
            HashMap<Character, Integer> map = new HashMap<>();
            int mx = 0;
 
           
            for (int j = 0; j < x.size(); j++) {
                if (x.get(j).size() > i) {
                    char ch = x.get(j).get(i);
                    int value = map.getOrDefault(ch, 0) + 1;
                    map.put(ch, value);
                    mx = Math.max(mx, value);
                }
            }
 
           
            ArrayList<Character> ans = new ArrayList<>();
            for (char ch : map.keySet()) {
                if (map.get(ch) == mx) {
                    ans.add(ch);
                }
            }
 
            Collections.sort(ans);
            System.out.print((i + 1) + ":");
            for (char ch : ans) {
                System.out.print(" " + ch);
            }
            System.out.println();
        }
    }
}