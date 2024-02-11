class Student
{
	private int rollno;						// Encapsulation is a process of hiding sensitive information from user.	
	private String name;					// It can be achieved by making variables as private and using getters and setters to 	
	private int sid;						// to set those private variables .
											// Encapsulation- binding date/variables with methods(getters and setters).
	public void setRollno(int rollno)
	{
		this.rollno = rollno;
	}
	public int getRollno()
	{
		return rollno;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName() 
	{
		return name;
	}
	public void setSid(int sid)
	{
		this.sid = sid;
	}
	public int getSid()
	{
		return sid;
	}
	
}

public class EncapsulationDemo 
{

	public static void main(String[] args) 
	{
		Student s = new Student();
/*		s.name = "Sunpreet";
		s.rollno = 1;
		s.sid = 100;
		System.out.println(s.name + " " + s.rollno + " " + s.sid);
*/		
		s.setName("Sunpreet");
		s.setRollno(1);
		s.setSid(100);
		System.out.println(s.getName() + " " + s.getRollno() + " " + s.getSid());
	}

}
