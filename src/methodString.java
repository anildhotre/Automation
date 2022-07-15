package stringdiscussion;

public class methodString {
	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "abc";
		boolean s3 = s1.equals(s2);
	System.out.println(s3);
	String s4 = "pune";
	String s5 = "PUNE";
	boolean s6 = s4.equalsIgnoreCase(s5);
    System.out.println(s6);
    String s7 = "Bhopal";
    int s8 = s7.length();
    System.out.println(s8);
    String s9 = "I live in mumbai";
    int s10 = s9.length();
    System.out.println(s10);
    String s11 = "Hyderabad";
    char s12 = s11.charAt(8);
    System.out.println(s12);
    String s13 = "secunderabad";
  
    String s14 = s13.substring(5);
    System.out.println(s14);
    String s15 = "punecity";
    String s16 = s15.substring(2,7);
    System.out.println(s16);
    String s17 = "BaraMati";
    String s18 = s17.toLowerCase();
    System.out.println(s18);
    String s19 = "amravati";
    String s20 = s19.toUpperCase();
    System.out.println(s20);
    String s21 = "Hyderabad";
    String s22 = s21.replace('H','h');
    System.out.println(s22);
    String s23 = "Aurangabad";
    String s24 = s23.replace("Auranga","osmana");
    System.out.println(s24);
    String s25 = "    string value    ";
    String s28 = s25.trim();
    System.out.println(s28);
    String s29 = "Aurangabad";
    int s30 = s29.indexOf('a');
    System.out.println(s30);
    String s31 = "Aurangabad";
    int s32 = s31.lastIndexOf('a');
    System.out.println(s32);
    String s33 = "Rameshwaram";
    boolean s34 = s33.startsWith("Ram");
    System.out.println(s34);
    boolean s38 = s33.startsWith("esh");
    System.out.println(s38);
    String s35 = "Rameshwaram";
    boolean s36 = s35.endsWith("ram");
    boolean s37 = s35.endsWith("mesh");
    System.out.println(s36);
    System.out.println(s37);
    String s39 = "Bengaluru";
    boolean s40 = s39.contains("luru");
    System.out.println(s40);
    boolean s41 = s39.contains("gal");
    System.out.println(s41);
    String s42 = "I live in pune";
    String[] s43 = s42.split(" ");
    for(String s44:s43)
    {
    	System.out.println(s44);
    }
    String s45 = "velocity";
    char[] s46 = s45.toCharArray();
    for(char c:s46)
    {
    	System.out.println(c);
    }
    int i1 = 56;
    String s47 = String.valueOf(i1);
    System.out.println(s47+5);
    boolean b = false;
    String s48 = String.valueOf(b);
    System.out.println(s48);

    
    
    
	
}

}
