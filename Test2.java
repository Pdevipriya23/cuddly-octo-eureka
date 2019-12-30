import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
 class Test2 
{
  public static void main(String[] args)
	{
	student s = new student(1001,"john",24,30,40,50,60);
     try(FileOutputStream fos = new FileOutputStream("emp.data");
    		 ObjectOutputStream oos = new ObjectOutputStream(fos);)
     {
    	 oos.writeObject(s);
     }
        catch(IOException ex)
     {
      System.out.println(ex);
      }
	}
}