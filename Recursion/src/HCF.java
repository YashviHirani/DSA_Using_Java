public class HCF {

    public static int findHCF(int n1, int n2){
// simple with loop :--
//        int ans = 1;
//        int min = Math.min(n1,n2);
//        for(int i = min; i>0; i--){
//
//            if(n1%i==0 && n2%i==0){
//                ans = i;
//                break;
//            }
//        }
//        return ans;

/// works with all func but just given an example of helper function --> TC = log(min(a,b))
//        if(n1==0) return n2;
//        return findHCF(n2%n1,n1);
        return helper(Math.min(n1,n2),Math.max(n1,n2));
    }

    public static int helper(int a, int b){
        if(a==0) return b;
        return helper(b%a,a);
    }

    public static void main(String[] args) {
        System.out.println(findHCF(29,41));
    }
}
