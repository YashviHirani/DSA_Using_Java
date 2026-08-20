import java.util.Arrays;

public class CyclicSort {
    static int sortUsingCyclicSort(int arr[]) {
        // code here
        int i = 0;
        int swap = 0;
        while (i<arr.length){
            if(i==arr[i]) i++;
            else{
                arr[i] = arr[arr[i]] + arr[i] - (arr[arr[i]] = arr[i]); // a = b + a - (b=a)
                swap++;
            }
        }
        // 0 1 2 3 4 5
        // 2 1 4 5 0 3
        //     i
        System.out.println(Arrays.toString(arr));
        return swap;
    }

    public static void main(String[] args) {
        System.out.println(sortUsingCyclicSort(new int[]{0,1,2,3,4}));
    }
}
