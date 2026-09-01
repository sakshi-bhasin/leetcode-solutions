import java.util.Arrays;

//time:O(n), space=O(n)
public class LeftRotateArrayByD {

    public int[] leftRotateArrayByD(int[] nums,int d)
    {
        int index=0;
        int[] array=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            if(i>=d)
            {
                index=i-d;
            }
            else if(i<d)
            {
                index=i+nums.length-d;
            }
            array[index]=nums[i];
        }
        return array;
    }

    public static void main(String[] args) {
        LeftRotateArrayByD obj=new LeftRotateArrayByD();
        int[] nums={1,2,3,4,5};
        int d=2;
        int[] result = obj.leftRotateArrayByD(nums, d);
        System.out.println(Arrays.toString(result));

    }
    
}
