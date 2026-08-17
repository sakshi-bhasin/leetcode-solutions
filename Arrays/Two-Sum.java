import java.util.HashMap;
class Solution {

    // Approach 1: Brute Force, Time: O(n²) Space: O(1)
    public int[] twoSumBruteForce(int[] input, int target) {
        int[] indices=new int[2];
        for(int i=0;i<input.length;i++)
        {
            for(int j=i+1;j<input.length;j++)
            {
                if(input[i]+input[j]==target)
                {
                    indices[0]=i;
                    indices[1]=j;
                    return indices;
                }
            }	
        }
    return indices;
    }

    // Approach 2: Target - Current + Linear Search, Time: O(n²) Space: O(1)
    public int[] twoSumSearch(int[] input, int target) {
        int[] indices=new int[2];
        for(int i=0;i<input.length;i++)
        {
            int first_number=input[i];
            int needed=target-first_number;
            for(int j=i+1;j<input.length;j++)
            {
                if(input[j]==needed)
                {
                    indices[0]=i;
                    indices[1]=j;
                    return indices;
                }
            }	
        }
    return indices;
    }

    // Approach 3: HashMap - Optimal, Time: O(n) Space: O(n)
    public int[] twoSumHashMap(int[] input, int target) {
	    int[] indices=new int[2];
	    HashMap<Integer,Integer> map=new HashMap<>();
	    for(int i=0;i<input.length;i++)
	    {
		    int needed=target-input[i];
		    if(!map.containsKey(needed))
		    {
			    map.put(input[i],i);
		    }
		    else
		    {
			    indices[0]=map.get(needed);
			    indices[1]=i;
			    return indices;
		    }
	    }
    return indices;
    }
}