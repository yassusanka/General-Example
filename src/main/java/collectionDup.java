import java.util.HashMap;
import java.util.Map;

public class collectionDup {

    public static void main(String args[]) {

        int[] arr = {2, 3, 4, 1, 20, 3,4};

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i <arr.length ; i++) {

            int key = arr[i];
            if (map.containsKey(key))
            {
                int count = map.get(key);
                count++;
                map.put(key, count);
            } else
            {
                map.put(key, 1);
            }
        }
            for (Map.Entry<Integer, Integer> val : map.entrySet()) {
                System.out.println(val.getKey() + " occurs " + val.getValue() + " times");
            }
        }
    }

