public class RemoveDuplicates {

    //time:O(n), space=O(n)
    public int removeDuplicates(int[] nums)
    {
        int unique=1;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]==nums[i-1])
            {
                continue;
            }
            else{
                nums[unique]=nums[i];
                unique++;
            }
        }
        return unique;
    }

    public static void main(String[] args) {
      int[] array = new int[]{1,2,2,3,5,5};
      RemoveDuplicates obj=new RemoveDuplicates();
      int result=obj.removeDuplicates(array);
      System.out.println(result);
    }
}