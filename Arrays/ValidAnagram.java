import java.util.Arrays;
import java.util.HashMap;

public class ValidAnagram {

    public static boolean checkValidAnagramSorting(String s,String t)
    {
        if(s.length()!=t.length())
            return false;
        char[] array_t=t.toCharArray();
        char[] array_s=s.toCharArray();
        Arrays.sort(array_s);
        Arrays.sort(array_t);
        for(int i=0;i<array_s.length;i++)
        {
            if(array_s[i]!=array_t[i])
                return false;
        }
        return true;
    } 

    public static boolean checkValidAnagramFreqArray(String s,String t)
    {
        if(s.length()!=t.length())
            return false;
        int[] count=new int[26];
        char[] array_t=t.toCharArray();
        char[] array_s=s.toCharArray();
        int index_s;
        int index_t;
        for(int i=0;i<array_s.length;i++)
        {
            index_s=array_s[i]-'a';
            count[index_s]++;
        }
        for(int j=0;j<array_t.length;j++)
        {
            index_t=array_t[j]-'a';
            count[index_t]--;
        }
        for(int z=0;z<26;z++)
        {
            if(count[z]!=0)
            {
                return false;
            }
        }
        
        return true;
    } 

    public static boolean checkValidAnagramHashMap(String s,String t)
    {
        if(s.length()!=t.length())
            return false;
        HashMap<Character,Integer> map=new HashMap<>();
        int count;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            count=map.getOrDefault(c,0);
            count++;
            map.put(c,count);

        }
        for(int j=0;j<t.length();j++)
        {
            char d=t.charAt(j);
            count=map.getOrDefault(d,0);
            count--;
            map.put(d,count);
        }
       for (int value : map.values()) 
        {
        if(value!=0)
            return false;
        }
        return true;
    } 
    public static void main(String[] args)
    {
        String s="anagram";
        String t="nagaram";
        boolean resultBruteForce=checkValidAnagramSorting(s,t);
        boolean resultFreqArray=checkValidAnagramFreqArray(s,t);
        boolean resultHashMap=checkValidAnagramHashMap(s,t);
        System.out.println("Result for Brute Force approach is:"+ resultBruteForce);
        System.out.println("Result for Sorting approach is:"+ resultFreqArray);
        System.out.println("Result for HashSet approach is:"+ resultHashMap);
    }
}