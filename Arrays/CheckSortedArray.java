public class CheckSortedArray {

    //optimal time=O(n), space=O(1)
    public boolean isArraySorted(int[] nums)
    {
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]>nums[i+1])
                return false;
        }
        return true;
    }
    public static void main(String[] args)
    {
        CheckSortedArray obj=new CheckSortedArray();
        int[] nums={1,2,6,4,5};
        System.out.println("is array sorted :"+ obj.isArraySorted(nums));

    }
    
}
