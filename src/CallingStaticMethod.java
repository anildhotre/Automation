package method;

public class CallingStaticMethod {
	public static void m1(){
		System.out.println("m1 method");
		
	}
	public static void m2(){
		m1();//calling of static method inside of another static method
		System.out.println("m2 method");
		
	}
	public static void main(String[] args) {
		m2();
	}
}	
