public class MissingInNums {
    static int missingNum(int arr[]) {
        // code here
        int i = 0;
        int swap = 0;
        int size = arr.length-1;

        while (i<arr.length && swap<(size+1)){
             if((i+1)==arr[i] || arr[i]>size) i++;
             else{
                 arr[i] = arr[arr[i]-1] + arr[i] - (arr[arr[i]-1] = arr[i]); // a = b + a - (b=a)
             }
        }
        for(i = 1; i<=(size+1); i++){
            if(i!=arr[i-1]) break;
        }
        return i;
    }
    public static void main(String[] args) {

        System.out.println(missingNum(new int[]{2,6,5,1,3}));
    }
}
