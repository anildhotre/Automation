package stringdiscussion;

public class scpConcept {
public static void main(String[] args) {
	String ss1 = new String("abc");
	System.out.println(ss1);//abc
	
	String ss2 = new String("abc");
	String ss3 = new String("abc");
	String ss4 = new String("def");
	System.out.println(ss3);
	System.out.println(ss4);
	
	String s = new String("abc");
	String s1 = new String("jkl");
	String s2 = new String("jkl");
	
	boolean ispointingsmeobject= s1==s2;
	System.out.println(ispointingsmeobject);//false
	
	boolean ispointsame= ss1==s;
	System.out.println(ispointsame);//false
	
	//equal()
	
	boolean iscontentequal= s1.equals(s2);
	System.out.println(iscontentequal);//true
	
	boolean isequal= ss1.equals(s);
	System.out.println(isequal);//true
	
	boolean ispointsame2= ss1==ss2;
	System.out.println(ispointsame2);//false
	
	
	
}
}
