public class towerOfHanoi {
    static int count = 0;
    public static void hanoi(int n,String a, String b, String c){

        if(n==0) return;
        // a b c
        // a to b via c
        // a to c --> print it
        // b to c via a
        hanoi(n-1,a,c,b);
        System.out.println(a + " --> " + c);
        count++;
        hanoi(n-1,b,a,c);
    }

    public static void main(String[] args) {
        hanoi(5,"A","B","C");
        System.out.println(count);
    }
}
