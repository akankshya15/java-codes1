package akankshya;

public class StrudentExam extends LibraryDetails {
	private int sub1;
	private int sub2;
	public StrudentExam(int regno, String stdname, String group,int booksDue, int sub1, int sub2){
		super(regno,stdname,group,booksDue);
		this.sub1=sub1;
		this.sub2=sub2;
		
	}
	public void Display(){
		System.out.println("from sub class ");
		
	}
	 public void output(){
		 int total= sub1+sub2;
		 System.out.println(regno+" "+ stdname+" " + group+" "+ total+" "+booksDue);
	 }
	public static void main(String[] args) {
		Student student=new Student();
		StrudentExam exam= new StrudentExam(123,"xyz","it",7,50,90);
		//exam.Display();
		//exam.output();
		student.Display();
		student=exam;
		student.Display();
	}

}
