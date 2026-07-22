package sdet;

public class StringManipulations {

	public static void main(String[] args) {

		// Reverse a string
		// Approach 1 ---> length() , charAt()
		/* String s = "Welcome";
		String rs = "";
		
		for(int i = s.length()-1;i>=0;i--)
		{
			rs = rs + s.charAt(i);
		}
		System.out.println("Reverse string is: "+rs); */
		
		// Approach 2 ---> without using string methods
		/* String s = "Welcome to Java";
		String rev_s = "";
		char ch[] = s.toCharArray();
		
		for(int i = ch.length-1;i>=0;i--)
		{
			rev_s = rev_s + ch[i];
		}
		System.out.println("Reversed string is: "+rev_s); */
		
		// Approach 3 ---> Using StringBuffer class
		// StringBuffer sb = new StringBuffer("Programming Knowledge");
		// System.out.println("Original string: "+sb+" and reversed string: "+sb.reverse());
		
		// Approach 4 ---> Using StringBuilder class
		StringBuilder sb = new StringBuilder("Programming Knowledge");
		System.out.println("Original string: "+sb+" and reversed string: "+sb.reverse());
	}

}
