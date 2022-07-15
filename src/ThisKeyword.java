package variable;

public class ThisKeyword {
	static String s = "abc";
	int i = 10;
	int j = 90;
	String name = "ron";
	public static void main(String[] args) {
		int i = 50;
		System.out.println(i);//50
		ThisKeyword tk = new ThisKeyword();
		System.out.println(tk.i);//10
		tk.m1();
	}
public void m1() {
	String s = "def";
	int j = 40;
	String name = "ricardo";
	System.out.println("without updation the name is "+name);
	this.name = name;
	System.out.println("the update name is"+this.name);
	System.out.println(j);//40
	System.out.println(this.j);//90
	System.out.println(s);//def
	System.out.println(this.s);//abc...using of this keyword to access of static variable is not recommended
	System.out.println(ThisKeyword.s);//abc
}
}
