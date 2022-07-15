package variable;

public class Collage {
	//student name---->string---->non static
	//collage name----->---->static
	//mobile no.---->int--->non static
	//math mark----->int---->nonstatic
	//city---->string---->static
	String name;
	static String collagename="coep";
	long mobile;
	int mathmark;
	static String city="pune";
	
	public static void main(String[] args) {
		Collage s1 = new Collage();
		s1.name = "anil";
		s1.mobile = 9096819365l;
		s1.mathmark= 65;
		Collage s2 = new Collage();
		s2.name = "ankush";
		s2.mobile = 8975132462l;
		s2.mathmark= 68;
		System.out.println(s1.name);
		System.out.println(s2.mathmark);
		
	}

}
