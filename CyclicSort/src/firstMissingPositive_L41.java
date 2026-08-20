import java.util.ArrayList;
import java.util.List;

public class firstMissingPositive_L41 {
    public static int firstMissingPositive(int[] nums) {

        int i = 0;
        int size = nums.length;

        while (i<size){
            if(nums[i]==(i+1)) i++;
            else{
                if(nums[i]<=0 || nums[i]>size){
                    i++;
                    continue;
                }
                nums[i] = nums[nums[i]-1] + nums[i] - (nums[nums[i]-1]=nums[i]);
            }
        }
        for(i = 0; i<size; i++){
            if(nums[i]!=(i+1)) return i+1;
        }
        return size+1;
    }

    public static void main(String[] args) {
        System.out.println(firstMissingPositive(new int[]{1}));
    }
}
