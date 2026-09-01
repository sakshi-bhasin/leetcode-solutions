import java.util.Arrays;
import java.util.HashSet;

public class UnionSortedArrays {

    //Time = O((N + M)²), space = O(N + M) 
    public int[] unionSortedArraysBruteForce(int[] array1, int[] array2)
    {
        int[] result=new int[array1.length+array2.length];
        int count=0;
        for(int i=0;i<array1.length;i++)
        {
            boolean visited=false;
           for(int j=0;j<count;j++)
            {
                
                if(array1[i]==result[j])
                {
                    visited=true;
                }
                
            } 
            if(visited==false)
                {
                    result[count]=array1[i];
                    count++;

                }
        }
        for(int k=0;k<array2.length;k++)
        {
            boolean visited=false;
            for(int l=0;l<count;l++)
            {
                if(array2[k]==result[l])
                {
                    visited=true;
                }
            }
            if(visited==false)
            {
                result[count]=array2[k];
                count++;
            }

        }
        return Arrays.copyOf(result, count);
    }    

    public HashSet<Integer> unionSortedArraysHashSet(int[] array1, int[] array2)
    {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<array1.length;i++)
        {
            if(!set.contains(array1[i]))
            {
                set.add(array1[i]);
            }
        }
        for(int j=0;j<array2.length;j++)
        {
            if(!set.contains(array2[j]))
            {
                set.add(array2[j]);
            }
        }
        return set;
    }    

    public int[] unionSortedArraysTwoPointers(int[] array1, int[] array2)
    {
       int[] result=new int[array1.length+array2.length];
       int count=0,i=0,j=0;
        while(i<array1.length && j<array2.length)
        {
            if(array1[i]<array2[j])
                {
                    if(count == 0 ||result[count-1]!=array1[i])
                    {
                        result[count]=array1[i];
                        count++;
                        
                    }
                    i++;
                }
                else if(array1[i]>array2[j])
                {
                    if(count == 0 || result[count-1]!=array2[j])
                    {
                        result[count]=array2[j];
                        count++;
                        
                    }
                    j++;
                }
                else if(array1[i]==array2[j])
                {
                    result[count]=array1[i];
                    count++;
                    i++;
                    j++;
                }
        }
        while(i < array1.length)
        {
            if(count == 0 || result[count-1] != array1[i])
            {
                result[count] = array1[i];
                count++;
            }
            i++;
        }
        while(j < array2.length)
        {
            if(count == 0 || result[count-1] != array2[j])
            {
                result[count] = array2[j];
                count++;
            }
            j++;
        }
        return Arrays.copyOf(result, count);
    }    


    public static void main(String[] args) {

    int[] array1 = {1, 2, 2, 3, 4};
    int[] array2 = {2, 3, 5, 5};    

    UnionSortedArrays obj = new UnionSortedArrays();

    int[] result = obj.unionSortedArraysTwoPointers(array1, array2);

    System.out.println(Arrays.toString(result));
}
}