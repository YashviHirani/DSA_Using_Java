import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class substringWithRecursion {

    public static List<String> AllPossibleStrings(String s) {
        // Code here
        List<String> a = new ArrayList<>();
        substring("",s,0,a);
        Collections.sort(a);
        return a;
    }
    public static void substring(String ans,String s, int idx,List<String> a){
        if(idx == s.length()){
            a.add(ans);
            return;
        }
        char ch = s.charAt(idx);
        substring(ans+ch, s, idx+1,a); // pick
        substring(ans, s, idx+1,a); // skip
    }

    public static void main(String[] args) {
        System.out.println(AllPossibleStrings("abc"));
    }
}
