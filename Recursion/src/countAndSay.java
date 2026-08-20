public class countAndSay {
    public static String countAndSay(int n) {
        if(n==0) return "";
        if(n==1) return "1";
        return slidingWindow(countAndSay(n-1)+"#");
    }

    public static String slidingWindow(String s){
        // 1 1 2 1 --> 21 12 11
        int i = 0;
        int j = 0;
        StringBuilder ans= new StringBuilder();
        while (j<= s.length()-1){
            if(s.charAt(i)!=s.charAt(j)){
                ans.append((j - i)).append(s.charAt(i));
                i = j;
            }
            j++;
        }
        /// niche na portion ni jagya e call krti vakte "#" nakhi didho so that last grp add thai jaay coz hash valu to add em pn nthi thavanu
//        if(s.charAt(i)==s.charAt(j-1)){
//            ans.append((j - i)).append(s.charAt(i));
//        }
        return ans.toString();
    }

    public static void main(String[] args) {
        System.out.println(countAndSay(5));
    }
}// 13112221// 1211
