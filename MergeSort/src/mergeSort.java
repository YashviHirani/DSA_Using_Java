import java.util.Arrays;

public class mergeSort {
    static int count = 0;
    public static void mergeSort(int[] arr){
        // [4,3,6,8,2,9,4,1]
        if(arr.length==1) return;
        int mid = arr.length/2;

        int[] a = new int[mid];
        int[] b = new int[arr.length - mid];

        for(int i = 0; i<a.length; i++) a[i] = arr[i];
        for(int i = 0; i<b.length; i++) b[i] = arr[i+mid];

        mergeSort(a);
        mergeSort(b);
        count = merge(arr,a,b);
        //System.out.println(Arrays.toString(arr));
    }
    public static int merge(int[] arr, int[] a,int[] b){

        int i = 0;
        int j = 0;
        int k = 0;
        int [] ans = new int[a.length+b.length];

        while(i<a.length && j<b.length){
            if(a[i]<b[j]) ans[k++] = a[i++];
            else {
                ans[k++] = b[j++];
                count++;
            }
        }

        while (i<a.length){
            ans[k++] = a[i++];
        }
        while (j<b.length){
            ans[k++] = b[j++];
        }

        for(int m = 0; m<ans.length; m++){
            arr[m] = ans[m];
        }
        return count;
    }
    public static void main(String[] args) {
        int [] arr = new int[]{2,4,2,3,1};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(count);
    }
}
