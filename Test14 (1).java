import java.util.TreeSet;
import java.util.Iterator;
class Test17
{
  public static void main(String[] args)
{
  TreeSet<Employee17> tset = new TreeSet<>();
  tset.add(new Employee17(102,"Babu",2000));
   tset.add(new Employee17(101,"Arun",1000));
  tset.add(new Employee17(104,"Dinesh",4000)); 
   tset.add(new Employee17(103,"Chandra",3000));
 for (Employee17 e: tset)
e.display();
}
}