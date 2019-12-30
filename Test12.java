import java.util.LinkedHashSet;
import java.util.*;
class Test12
{
 public static void main(String[] args)
  {
  LinkedHashSet<Employee> hs = new LinkedHashSet<Employee>();
  hs.add(new Employee(101,"Ajay",1000.00));
  hs.add(new Employee(103,"Chandu",3000.00));
  hs.add(new Employee(102,"Babu",2000.00));
  hs.add(new Employee(101,"Ajay",1000.00));
  
  for(Employee e:hs)
  e.display();
  
 }
}