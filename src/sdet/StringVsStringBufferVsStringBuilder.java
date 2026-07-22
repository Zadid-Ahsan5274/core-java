package sdet;

public class StringVsStringBufferVsStringBuilder {

	public static void main(String[] args) {
		
		// String ---> immutable
		String s = "welcome";
		s.concat(" to java");
		System.out.println(s); // immutable - can not change original value of s
		
		// StringBuffer ---> mutable
		StringBuffer sb = new StringBuffer("Welcome");
		sb.append(" to java");
		System.out.println(sb); // mutable - we can change original value of sb
		
		// StringBuilder ---> mutable
		StringBuilder sb1 = new StringBuilder("Welcome");
		sb1.append(" to eclipse");
		System.out.println(sb1); // mutable - we can change original value of sb1

	}

}
