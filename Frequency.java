import java.util.HashMap;
import java.util.Map;
class Main{
    public static HashMap<Integer,Integer>Solution(int[] array)
     {
     HashMap<Integer,Integer>map=new HashMap<>();
     for(int num:array)
     {
         map.put(num,map.getOrDefault(num,0)+1);
     }
    
     for(Map.Entry<Integer,Integer>Rahul:map.entrySet())
     {
         if(Rahul.getValue()>2)
         {
             System.out.print(Rahul.getKey());
         }
     }
      return map;
     }
    public static void main(String[] args){
      int[] array={1,2,3,4,5,6,7,8,8,8};
      Solution(array);
    }
}
