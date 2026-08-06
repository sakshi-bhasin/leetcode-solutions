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

public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> seen = new HashSet<>();

        for (int num : nums) {
            if (seen.contains(num)) {
                return true;
            }

            seen.add(num);
        }

        return false;
    }
}

//