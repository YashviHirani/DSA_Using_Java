public class uniquePaths {
    public static int uniquePaths(int m, int n) {

        if(m==1 && n==1) return 1;
        if(m==0 || n==0) return 0;
        return uniquePaths(m-1,n) + uniquePaths(m,n-1);
     //   return helper(m-1,n-1,0,0);
    }
//    public static int helper(int m,int n, int rowNum, int colNum){
//        if(rowNum==m && colNum==n) return 1;
//        if(rowNum>m || colNum>n) return 0;
//        int right = helper(m,n,rowNum+1,colNum);
//        int left = helper(m,n,rowNum,colNum+1);
//        ///  try to print paths like rrdd in string using recursion
//        return right+left;
//    }

    public static void main(String[] args) {
        System.out.println(uniquePaths(4,4));
    }
}
