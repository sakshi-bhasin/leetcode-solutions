import java.util.Arrays;

public class LeftRotateArrayByOne{

    //time:O(n), space=O(1)
    public int[] leftRotateArrayByOne(int[] nums)
    {
        int first=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            nums[i-1]=nums[i];
        }
        nums[nums.length-1]=first;
        return nums;
    }

    public static void main(String[] args) {
        LeftRotateArrayByOne obj=new LeftRotateArrayByOne();
        int[] nums={1,2,3,4,5};
        int[] result = obj.leftRotateArrayByOne(nums);
        System.out.println(Arrays.toString(result));

    }


}