
class Student
{
  private int sid;
  private String sname;
  double fees;
  public Student(){}
  public Student(int sid,String sname,double fees)
 {
  this.sid=sid;
  this.sname=sname;
  this.fees=fees;
  }
  public void setSid(int sid)
   {
      this.sid=sid;
    }
   public void setSname(String sname)
     {
       this.sname=sname;
     }
  public void setFees(double fees)
  {
    this.fees=fees;
  }
  public int getSid()
  {
      return sid;
   }
  public String getSname()
  {
    return sname;
  }
  public double getFees()
  {
      return fees;
  }
}
class Training
{
    int trainingid;
   int trainingname;
   Student[]s;
   public Training(){}
   public Training(int trainingid,String trainingname,Student[]s)
    {
      this.trainingid=trainingid;   this.trainingname=trainingname;    this.s=s;
     }
   public void setTrainingid(int trainingid)
    {
      this.trainingid=trainingid;
    }
    public void setTrainingname(String trainingname)
   {
      this.trainingname=trainingname;
    }
    public void setStudent(Student[] s)
   {
     this.s=s;
   }
    public int getTrainingid()
   {
      return trainingid;
    }
   public String getTrainingname()
      {
            return trainingname;
    }
   public Student[] getStudent()
    {
             return s;
    }
}






 



  