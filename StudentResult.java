package akankshya;

public class StudentResult {

	public static void main(String[] args) {
		
		int regno= 101;
		int sub1=20;
		int sub2=70;
		int sub3=90;
		int total=sub1+sub2+sub3;
		float average=total/3;
		
		if(sub1>=40 && sub2>=40 && sub3>= 40)
			System.out.println("pass");
		else
			System.out.println("fail");

	}

}
