import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

class generateParenthesis1 {
    public static List<String> generateParenthesis(int n) {

        List<String> al1 = new ArrayList<>();
        helper(0,0,n,"",al1);
        return al1;
    }

    public static void helper(int l, int r, int n, String ans, List<String> al1 ){
        if(r==n){
            al1.add(ans);
            return;
        }
        if(l<n || l==r) helper(l + 1, r, n, ans + "(", al1);
        if(r<n && l!=r) helper(l,r+1,n,ans+")",al1);
    }
    public static void main(String[] args) {
        System.out.println(generateParenthesis(3));
    }
}
