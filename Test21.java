import java.util.HashMap;
class Test21
{
public static void main (String[] args)
{
  HashMap<String,String> map = new HashMap<>();
  map.put("abc@gmail.com", "abc@123");
  map.put("xyz@yahoo.com", "xyz@231");
  map.put("bbrediff.com","reddc");
  map.put("user.com","somexyz");
System.out.println(map.size());
System.out.println(map.get("xyz@yahoo.com"));   // to get counterpart
}
}
  