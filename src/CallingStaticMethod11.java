package method;

public class CallingStaticMethod11 {
	public void m3() {
		m2();//calling of static method inside non static method
		System.out.println("m3 method");
	}
	public static void m1(){
		System.out.println("m1 method");
	}
	public static void m2() {
		m1();//calling of static method inside another static method
		System.out.println("m2 method");
	}
public static void main(String[] args) {
	CallingStaticMethod varname = new CallingStaticMethod();
	varname.m2();
	CallingStaticMethod11 aa = new CallingStaticMethod11();
	aa.m3();
}
}	


