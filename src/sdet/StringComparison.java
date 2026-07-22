package sdet;

public class StringComparison {

	public static void main(String[] args) {
		
		// case 1
		/* String s1 = "welcome";
		String s2 = "welcome";
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2)); */
		
		// case 2
		/* String str1 = new String("Welcome");
		String str2 = new String("Welcome");
		System.out.println(str1 +" "+str2);
		System.out.println(str1==str2); // to compare objects
		System.out.println(str1.equals(str2));  // to compare values of objects */
		
		// case 3
		/* String s1 = "abc";
		String s2 = new String("abc");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2)); */
		
		// case 4
		String s1 = "abc";
		String s2 = new String("abc");
		String s3 = s2;
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println(s2==s3);
		System.out.println(s2.equals(s3));
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
	}

}
