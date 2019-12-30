
public class person
{
	int ssn;
	String name;
	int age;
	public person() {}
	public person(int ssn, String name, int age) 
	{
		this.ssn = ssn;   this.name = name;  this.age = age;
	}
	public int getSsn() {
		return ssn;
	}
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	

}
