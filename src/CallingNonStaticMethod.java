package method;

public class CallingNonStaticMethod { 
	public void m1() {
		System.out.println("m1 method is exicute");
	}
	public static void m2() {
		CallingNonStaticMethod bb = new CallingNonStaticMethod();
		bb.m1();//calling of non static method from same class inside the static method
		System.out.println("m2 is exicute");
		NonStaticMethod22 ss = new NonStaticMethod22();
		ss.methodThree();
		
	}
	public static void  main(String[] args) {
	m2();	
	}

}
