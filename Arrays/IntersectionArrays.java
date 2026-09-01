import java.util.Arrays;
import java.util.HashMap;

public class IntersectionArrays{

    // Brute Force: Time O(N*M), Space O(N+M)
    public int[] findIntersectionArrays(int[] array1,int[] array2)
    {
        int[] result=new int[array1.length+array2.length];
        int count=0;
        boolean[] visited=new boolean[array2.length];
        for(int i=0;i<array1.length;i++)
        {
            for(int j=0;j<array2.length;j++)
            {
                if(array1[i]==array2[j] && visited[j]==false)
                {
                    result[count]=array1[i];
                    count++;
                    visited[j]=true;
                    break;
                }
            }
        }
        return Arrays.copyOf(result, count);
    }

    // HashMap: Time O(N+M), Space O(N+M)
    public int[] findIntersectionArraysHashMap(int[] array1, int[] array2) {

    int[] result = new int[Math.min(array1.length, array2.length)];
    int count = 0;

    HashMap<Integer, Integer> map = new HashMap<>();

    // Store frequency of elements from array1
    for (int i = 0; i < array1.length; i++) {

        if (map.containsKey(array1[i])) {
            map.put(array1[i], map.get(array1[i]) + 1);
        } else {
            map.put(array1[i], 1);
        }
    }

    // Traverse array2
    for (int i = 0; i < array2.length; i++) {

        if (map.containsKey(array2[i]) && map.get(array2[i]) > 0) {

            result[count] = array2[i];
            count++;

            map.put(array2[i], map.get(array2[i]) - 1);

            if (map.get(array2[i]) == 0) {
                map.remove(array2[i]);
            }
        }
    }

    return Arrays.copyOf(result, count);
}

    // Two Pointers: Time O(N+M), Space O(N+M)
    public int[] findIntersectionArraysTwoPointers(int[] array1, int[] array2)
    {
        int i=0,j=0,count=0;
        int[] result=new int[array1.length+array2.length];
        while(i<array1.length && j<array2.length)
            {
                if(array1[i]<array2[j])
                {
                    i++;
                }
                else if(array1[i]>array2[j])
                {
                    j++;
                }
                else {
                    result[count]=array1[i];
                    count++;
                    i++;
                    j++;

                }
            } 
            return Arrays.copyOf(result,count);
    }

public static void main(String[] args)
{
    int[] array1 = {1, 2, 2, 3, 4};
    int[] array2 = {2, 2, 3, 5};

    IntersectionArrays obj = new IntersectionArrays();

    int[] result = obj.findIntersectionArraysTwoPointers(array1, array2);

    System.out.println(Arrays.toString(result));
}
}