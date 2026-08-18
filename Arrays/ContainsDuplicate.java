//Find if array contains duplicate elements

/*
Approach:

Traverse the array once.
Store visited elements in a HashSet.
If the current element already exists in the HashSet, return true.
Otherwise, add it to the HashSet.
If the loop completes, return false.
*/

//Time Complexity: O(n)

//Space Complexity: O(n)


import java.util.HashSet;
import java.util.Arrays;

public class ContainsDuplicate {
    public static boolean containsDuplicateOptimalHashSet(int[] nums) {

        HashSet<Integer> seen = new HashSet<>();

        for (int num : nums) {
            if (seen.contains(num)) {
                return true;
            }

            seen.add(num);
        }

        return false;
    }

    public static boolean containsDuplicateCompareEachElement(int[] nums){
    
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                {
                    return true;
                }
            }
        }
    return false;
    }

    public static boolean containsDuplicateSorting(int[] nums)
    {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1])
            {
                return true;
            }
        }
    return false;
    }

    public static void main(String[] args)
    {
        int[] nums={2,4,1,6,1};
        boolean resultBruteForce=containsDuplicateCompareEachElement(nums);
        boolean resultSorting=containsDuplicateSorting(nums);
        boolean resultHashSetOptimal=containsDuplicateOptimalHashSet(nums);
        System.out.println("Result for Brute Force approach is:"+ resultBruteForce);
        System.out.println("Result for Sorting approach is:"+ resultSorting);
        System.out.println("Result for HashSet approach is:"+ resultHashSetOptimal);
    }
}