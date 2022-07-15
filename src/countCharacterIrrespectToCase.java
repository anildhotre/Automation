package stringdiscussion;

public class countCharacterIrrespectToCase {
public static void main(String[] args) {
	String s = "philippines";
	int count = 0;
	String s1 = s.toLowerCase();
	for(int i=0;i<s1.length();i++) {
		char c = s1.charAt(i);
		if(c=='p') {
			count++;
		}
		}
	System.out.println("Total occurance of p is :"+count);
	}
}
