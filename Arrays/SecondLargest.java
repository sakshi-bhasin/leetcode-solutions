public class SecondLargest {

    //Time O(n), Space O(1)
    public int findSecondLargest(int[] nums)
    {
        int largest=nums[0], secondLargest=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++) //O(n)
        {
            if(nums[i]>largest)
            {
                secondLargest=largest;
                largest=nums[i];
            }
            else if(nums[i]>secondLargest && nums[i]!=largest)
            {
                secondLargest=nums[i];
            }
        }
    if(secondLargest == Integer.MIN_VALUE)
        return -1;
    else
        return secondLargest;
    }

    public static void main(String[] args) {

    int[] nums = { 5, 5, 5};

    SecondLargest obj = new SecondLargest();

    int result = obj.findSecondLargest(nums);

    System.out.println(result);
}
}