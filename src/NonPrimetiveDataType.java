package datatype;

public class NonPrimetiveDataType {
	public static void main(String[] args) {
		String s = "abc";
		System.out.println(s);
	String ss = s + "def";
	System.out.println(ss);
	String ss2 = "ghi" + "jkl";
	
	System.out.println(ss2);
	int f = 50;
	String ss3 = s + 56;
	System.out.println(ss3);//abc56
	String ss4 = "100";
	String ss5 = ss4 + 56;
	System.out.println(ss5);//10056
	String ss6 = ss5 + true;
	System.out.println(ss6);//10056true
	int d = 50;
	int k = f + d;
	System.out.println(k);//100
	System.out.println("The sum of f and d : "+k);
	System.out.println("The sum of "+f+" and "+d+" is : "+k );
	int a = 45;
	int b = 93;
	int c = a + b;
	System.out.println(c);
	int v = 56;
	int e = 45;
	int j = v - e;
	System.out.println(j);
	int x = 23;
	int y = 11;
	int z = x * y;
	System.out.println(z);
	int l = 80;
	int m = 8;
	int n = l/m;
	System.out.println(n);
	double bb = 675;
	double aa = 8;
	double ccc = bb/aa;
	System.out.println(ccc);
	
		
	
}

}
