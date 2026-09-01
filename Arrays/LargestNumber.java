import java.util.Arrays;

public class LargestNumber {

    //Time  → O(n), Space → O(1). this is optimal solution
    public int findlargestNumber(int[] nums)
    {
        int largest=nums[0];
        for(int i=1;i<nums.length;i++) //since nums[0] is largest, we start with nums[1]
        {
            if(nums[i]>largest)
                largest=nums[i];
        }
        return largest;
    }

    //Time  → O(nlogn), Space → O(1)
    public int findlargestNumberSorting(int[] nums)
    {
        Arrays.sort(nums);
        int largest=nums[nums.length-1];
        return largest;
    }
    
}
