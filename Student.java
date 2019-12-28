package akankshya;

public class Student {
	protected int regno;
	protected String stdname;
	protected String group;
	
	public void Display(){
		System.out.println("from super class Student");
		
	}
public Student(int regno, String stdname, String group )
{
	this.regno=regno;
	this.stdname=stdname;
	this.group=group;
	}
public Student()
{
	}
}
