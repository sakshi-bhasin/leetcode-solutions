
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class GroupAnagram {

    public ArrayList<ArrayList<String>> groupAnagramOptimalHashMap(String[] str)
    {
        HashMap<String,ArrayList<String>> map=new HashMap<>();
        for(int i=0;i<str.length;i++)
        {
            int[] freq=new int[26];
            char[] array=str[i].toCharArray();
            for(int j=0;j<array.length;j++)
            {
                int index=array[j]-'a';
                freq[index]++;
            }
            StringBuilder builder=new StringBuilder();
            for(int count : freq)
            {
                builder.append(count).append('#');
            }
            String key=builder.toString();
            if(map.containsKey(key))
            {
                map.get(key).add(str[i]);
            }
            else
            {
                ArrayList<String> group=new ArrayList<>();
                group.add(str[i]);
                map.put(key, group);
            }
        
    }
    ArrayList<ArrayList<String>> result = new ArrayList<>();
    for (ArrayList<String> group : map.values()) 
    {
        result.add(group);
    }
    return result;
    }

    public ArrayList<ArrayList<String>> groupAnagram(String[] str)
    {
        
        ArrayList<ArrayList<String>> result=new ArrayList<>();
        boolean[] visited=new boolean[str.length];
        for(int i=0;i<str.length;i++)
        {
            
            if(visited[i])
            {
                continue;
            }
            ArrayList<String> group=new ArrayList<>();
            group.add(str[i]);
            visited[i]=true;
            for(int j=i+1;j<str.length;j++)
            {
                if(!visited[j])
                {
                    boolean isAnagram=checkAnagram(str[i],str[j]);
                    if(isAnagram)
                    {
                        group.add(str[j]);
                        visited[j]=true;
                    }
                }
            }
        result.add(group);
        }
    return result;
    }

    private boolean checkAnagram(String string1, String string2) {
        if(string1.length()!=string2.length())
            return false;
        char[] array1=string1.toCharArray();
        char[] array2=string2.toCharArray();
        Arrays.sort(array1);
        Arrays.sort(array2);
        for(int i=0;i<array1.length;i++)
        {
            if(array1[i]!=array2[i])
                {
                    return false;
                }
            
        }
        return true;
    }

    public static void main(String[] args) {

    String[] str = {"eat", "tea", "tan", "ate", "nat", "bat"};

    GroupAnagram obj = new GroupAnagram();

    ArrayList<ArrayList<String>> result = obj.groupAnagramOptimalHashMap(str);

    System.out.println(result);
}
}