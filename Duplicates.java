import java.util.HashMap;
import java.util.Map;
class Main{
public static HashMap<Integer,Integer> Solution(int[] array)
{
    HashMap<Integer,Integer>map=new HashMap<>();
    for(int num:array)
    {
        map.put(num,map.getOrDefault(num,0)+1);
    }
    for(Map.Entry<Integer,Integer>Rahul:map.entrySet())
    {
        if(Rahul.getValue()>1)
        {
        
    System.out.println(Rahul.getKey());
        }
    }
    return map;
}
    public static void main(String[] args)
    {
        int [] array={2,3,1,2,3};
        System.out.println("The Duplicates are");
        Solution(array);
       
    }
}
