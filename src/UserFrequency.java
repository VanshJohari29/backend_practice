import java.util.HashMap;
import java.util.*;
public class UserFrequency {
    public static void main(String[] args){
        Map<String , Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] s = new String[n];
        for(int i=0;i<n;i++){
            s[i] = sc.next();
        }
        for(String name : s){
            if(map.containsKey(name)){
                map.put(name,map.get(name)+1);
            }
            else{
                map.put(name,1);
            }
        }
        for (String key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
    }
}
