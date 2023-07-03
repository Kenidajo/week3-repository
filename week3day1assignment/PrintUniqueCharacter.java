package week3day1assignment;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String MyName="JosephineKenida";
     String output="";
     //Duplicate e,i,n,
     char[] ch = MyName.toCharArray();
     Set<Character> name=new HashSet<Character>();
     for (Character i : ch) {
    	 if(name.add(i))
        
	output=output+i;
     
	}
     System.out.println(name);
 	System.out.println(output);
}
	
}

