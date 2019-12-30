import java.util.HashSet;
import java.util.*;
class Test11
{
 public static void main(String[] args)
  {
  HashSet<String> hs1 = new HashSet<String>();
  hs1.add("Welcome");
  hs1.add("Hello");
  hs1.add("Bye Bye");
  hs1.add("Farewel");
  HashSet<String> hs2 = new HashSet<String>();
  hs2.add("Apple");
  hs2.add("Banana");
  hs1.add(hs2);
  for(String s:hs1)
  System.out.println(s);
  
 }
}