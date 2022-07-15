package coreJava;

public class reverseString {
public static void main(String[] args) {
	String s = "Mumbai";
	String rev = "";
	for(int i=0;i<s.length();i++) {
		rev = s.charAt(i)+rev;
	}
	System.out.println("reversed string is:"+rev);
}
}
