package sdet;

import java.util.Arrays;

public class SortingStrings {

    public static void main(String[] args) {
        // char s[] = {'C','A','B','D'};
        String s[] = {"Java", "Python", "C++", "C#", "JavaScript"};
        System.out.println("Array before sorting...");
        System.out.println(Arrays.toString(s));
        Arrays.sort(s);
        System.out.println("Array after sorting...");
        System.out.println(Arrays.toString(s));

    }
}
