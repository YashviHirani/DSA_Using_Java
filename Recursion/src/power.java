public class power {

    public static int powerOfARaiseToB(int a, int b){
        return (b<=0) ? 1 : a*powerOfARaiseToB(a,b-1);
    }

    public static void main(String[] args) {
        System.out.println(powerOfARaiseToB(2,-1));
    }
}
