import java.io.File;
class Test23
{
   public static void main (String[] args)
    {
      File f =new File("Test.java"); 
     System.out.println(f.isFile( ));
     System.out.println(f.length());
     System.out.println(f.isDirectory());
     System.out.println(f.canRead());
     System.out.println(f.getName());
     System.out.println(f.canExecute());
    }
}