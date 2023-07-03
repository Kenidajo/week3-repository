package week3day1assignment;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="PayPal India";
		String output="";
		char[] charArray = name.toCharArray();
		Set<Character> charSet=new LinkedHashSet<Character>();
		Set<Character> dupCharSet=new LinkedHashSet<Character>();
		for (int i = 0; i < charArray.length; i++) {
			if(!charSet.add(charArray[i]))
			output=output+charArray[i];
		}
		System.out.println(charSet);
		System.out.println(output);
		char[] charArray1 = output.toCharArray();
		for (int j = 0; j < charArray1.length; j++) {
			if(dupCharSet.add(charArray1[j]));
		}
		System.out.println(dupCharSet);
	}

}
