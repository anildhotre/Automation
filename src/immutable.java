package stringdiscussion;

public class immutable {
public static void main(String[] args) {
	String s ="abc";
	s.concat("def");
	System.out.println(s);//immutable//abc
	
	
	StringBuffer sb = new StringBuffer("xyz");
	sb.append("tuv");
	System.out.println(sb);//mutable//xyztuv
}
}
