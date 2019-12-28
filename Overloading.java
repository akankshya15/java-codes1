package akankshya;

public class Overloading {
	
	void add(int x, int y)
	{
		System.out.println("int  "+(x+y) );
	}
	void add(String x, String y)
	{
		System.out.println("String  "+(x+y) );
	}

	void add(double x, double y)
	{
		System.out.println("double  "+(x+y) );
	}


	public static void main(String[] args) {
		Overloading overloading= new Overloading();
		overloading.add(5, 4);
		overloading.add("x", "y");
		overloading.add(5.6, 20.3);

	}

}
