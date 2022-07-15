package coreJava;

public class evenString {
public static void main(String[] args) {
	String st = "TestingString";
	for(int i=0;i<st.length();i++) {
		System.out.println(st.charAt(i)+" is at " +i +" position");
		i=i+1;
	}
}
}
