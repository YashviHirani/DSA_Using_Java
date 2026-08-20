public class FindtheDuplicateNumber_L287 {
    public static int findDuplicate(int[] arr) {

        // 0 1 2 3 4
        // 1 3 4 2 2
        //   i
        int i = 0;
        int lastMatched = -1;
        int size = arr.length;
        while(i<size){
            if(arr[i]==(i+1)){
                if(lastMatched==arr[i]) return arr[i];
                lastMatched = arr[i];
                i++;
            }
            else {
                if(arr[i] == arr[arr[i] - 1]) return arr[i];
                arr[i] = arr[arr[i]-1] + arr[i] - (arr[arr[i]-1]=arr[i]);
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(findDuplicate(new int[]{1,3,4,2,2}));
    }
}
