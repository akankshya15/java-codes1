package akankshya;

public  class ClassApplication extends ClassOne {

	public ClassApplication(int x, int y) {
		super(x, y);
		System.out.println(x+y);
		}

	public static void main(String[] args) {
		
		ClassApplication one= new ClassApplication(5,6);
		
	}

	@Override
	void output() {
		// TODO Auto-generated method stub
		
	}

}
