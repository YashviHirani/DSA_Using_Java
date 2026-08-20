public class BinarySearchWithRecursion {
    public static int search(int[] nums, int target) {
        return helper(nums,target,0,nums.length-1);
    }
    public static int helper(int[]nums, int target, int low, int high){
        if(low>high) return -1; /// aanu dhyan rakhvu
        int mid = (low+high)/2;
        if(nums[mid]==target) return mid;
        else if(nums[mid]>target) return helper(nums,target,low,mid-1);
        else return helper(nums,target,mid+1,high);
    }

    public static void main(String[] args) {
        System.out.println(search(new int[]{-1,0,3,5,9,12},9));
    }
}
