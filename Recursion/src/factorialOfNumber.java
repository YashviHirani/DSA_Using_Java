public class factorialOfNumber {
    static int ans= 1;


//    public static void factorial(int n){
//        if(n==1) return;
//        else if(n==0){
//            ans = 0;
//            return;
//        }
//        ans*=n;
//        factorial(n-1);
//    }

    public static int factorial(int n){
        return (n<=1) ? 1 : n*factorial(n-1);
    }
    public static void main(String[] args) {

        System.out.println(factorial(7));
//        System.out.println(ans);
    }
}
