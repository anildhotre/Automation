package polymorphism;

public class A {
	public void m1() {
		System.out.println("zero argument");
	}
public void m1(int a) {
	System.out.println("one argument");
}
public static void m1(String a) {
	System.out.println("one argument with string");
}
public int m1(int a, int b) {
	System.out.println("one argument with return type");
	return 70;
}
public void m1(int a, String b) {
	System.out.println("one argument with int and string");
}
public void m1(String a, int b) {
	System.out.println("one argument with String and int");
}
public static void main(String[] args) {
	A a = new A();
	a.m1();
	a.m1(67);
	m1("abc");
	a.m1("anil");//not recommended static method memory allocation class liading
	a.m1(70, 97);
}
}
