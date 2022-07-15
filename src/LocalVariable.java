package variable;

public class LocalVariable {
int i = 10;//non static variable
static int l = 23;//static variable
public static void main(String[] args) {
	int j = 50;//local variable
	System.out.println(j);//50
}
public void m1() {
	String s = "123";
	int j = 40;
	System.out.println(s);
	System.out.println(j);
}
public static void addition(int a, int b) {
	c = a + b;
	System.out.println(c);
}
}
