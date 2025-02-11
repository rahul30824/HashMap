import java.util.*;

class Main {
    public static int factors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] array = {20, 5, 11, 28, 19, 108};
    HashMap<Integer,Integer>fmap=new HashMap<>();
    for(int num:array)
    {
        fmap.put(num,factors(num));
    }
List<Map.Entry<Integer,Integer>>map=new ArrayList<>(fmap.entrySet());
map.sort((a, b) ->  Integer.compare(b.getValue(),a.getValue()));

for(Map.Entry<Integer,Integer>entry:fmap)
{
    System.out.print(entry.getKey());
}
    
}
}
