package BasicCode;

import java.util.HashMap;
import java.util.Map;

public class MapKeyValue {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        map.put("name","khillan");
        map.put("age","35");
        map.put("location","Noida");

         for(Map.Entry<String,String> entry: map.entrySet()){
            String Key= entry.getKey();
            System.out.println(Key+"-----"+entry.getValue());
         }
    }
}
