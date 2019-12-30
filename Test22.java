import java.util.HashMap;
import java.util.Set;
import java.util.Collection;
class Test22
{
public static void main (String[] args)
{
  HashMap<String,String> map = new HashMap<>();
  map.put("abc@gmail.com", "abc@123");
  map.put("xyz@yahoo.com", "xyz@231");
  map.put("bbrediff.com","reddc");
  map.put("user.com","somexyz");
  Set<String> keys = map.keySet();
  for(String k : keys)
   System.out.println(k+"   "+map.get(k));
   Collection<String> values = map.values();
  for(String v : values)
   System.out.println(v);

}
}
  