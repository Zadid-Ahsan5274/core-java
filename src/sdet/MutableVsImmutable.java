package sdet;

import java.util.Arrays;

public class MutableVsImmutable {

	public static void main(String[] args) {
		// Mutable - can change
		int a[] = {20,10,40,50,30};
		System.out.println("Before sorting: "+Arrays.toString(a));
		Arrays.sort(a); // mutable
		System.out.println("After sorting: "+Arrays.toString(a));
		
		// Immutable - can not change
		String str = new String("Hello from Earth"); // immutable - can not be changed
		System.out.println("Before concat: "+str);
		String concatString = str.concat(" and eclipse");
		System.out.println("After concat: "+concatString);
	}
}
