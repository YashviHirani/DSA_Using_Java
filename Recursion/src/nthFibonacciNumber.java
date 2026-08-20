public class nthFibonacciNumber {

    public static int nthFiboNum(int n){

        return nthFibonacci(n,0,1);
    }
    // Tail Recursion
    // Fibo => F(n)=F(n−1)+F(n−2) --> TC = 2^n
    public static int nthFibonacci(int n, int a, int b){
        if(n==0) return a;
        return nthFibonacci(n-1,b,a+b);
    }
/// LCM(a,b) = (a*b)/HCF(a,b)
    public static void main(String[] args) {
        System.out.println(nthFiboNum(5)); // 0 1 1 2 3 5 8 13 21
    }
}
