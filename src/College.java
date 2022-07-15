package Constructor;

public class College {
	
	String name;
	static String collagename="coep";
	long mobile;
	int mathmark;
	static String city="pune";
	public College(String name,long mob,int mmark) 
	{
	mathmark=mmark;
	mobile=mob;
	this.name=name;
	
	}
	public static void main(String[] args) {
		College s1 = new College("anil",9096819365l,75);
		College s2 = new College("ankush",9096819364l,85);
		System.out.println(s1.name);
		System.out.println(s2.mobile);

	}
	
}
