import java.util.Stack;

public class CelebrityProblem {
    public static int celebrity(int mat[][]) {
        // code here
        int i = 0;
        int j = 0;
        Stack<Integer> st1 = new Stack<>();

        int size = mat.length;
        for(i = 0; i<size; i++) st1.push(i);
        while(st1.size()>1){
            i = st1.pop();
            j = st1.pop();
            if(mat[i][j]==0 && mat[j][i]==1 && i!=j) st1.push(i);
            else if(mat[i][j]==1 && mat[j][i]==0 && i!=j) st1.push(j);
        }
        if(st1.isEmpty()) return -1;
        j = st1.pop();
        for(i = 0; i<size; i++){
            if((mat[i][j]==0 || mat[j][i]==1) && i!=j) return -1;
//            if(mat[j][i]==1 && mat[j][i]==0 )
        }
        return j;
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1, 0, 1},
                {1, 1, 1},
                {1, 1, 1}
        };
        System.out.println(celebrity(arr));
    }
}
