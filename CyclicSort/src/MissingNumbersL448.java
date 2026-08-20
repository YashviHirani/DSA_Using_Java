import java.util.ArrayList;
import java.util.List;

public class MissingNumbersL448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        int i = 0;
        int size = nums.length-1;

        while (i<=size){
            if(nums[i]==(i+1)) i++;
            else{
                if(nums[i]==nums[nums[i]-1]){
                    i++;
                    continue;
                }
                nums[i] = nums[nums[i]-1] + nums[i] - (nums[nums[i]-1]=nums[i]);
            }
        }
        List<Integer> ans = new ArrayList<>();
        for(i = 0; i<=size; i++){
            if(nums[i]!=(i+1)) ans.add(i+1);
        }
        return ans;
    }
}
