package method;

public class StaticMethod {
	public static void printHello() {
		System.out.println("Hellow");
		System.out.println("Hellow");
		System.out.println("Hellow");
		System.out.println("Hellow");
		System.out.println("Hellow");
	}
	
	public static void main(String[] args) {
		printHello();
		addition();
		substraction();
		multiplication();
		division();
		//calling of static method in other class i.e classname.methodname
		StaticMethod.printHello();
		
	
 }
	public static void addition() {
		int a = 10;
		int b = 34;
		int c = a+b;
		System.out.println(c);
	}
	public static void substraction() {
		int d = 10;
		int e = 43;
		int f = d-e;
		System.out.println(f);
	}
	public static void multiplication() {
		int h = 23;
		int i = 4;
		int j = h*i;
		System.out.println(j);
	}
	public static void division() {
		int k = 342;
		int l = 6;
		int m = k/l;
		System.out.println(m);
	}

}
