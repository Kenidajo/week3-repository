package week3day1assignment;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintDuplicateNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {4,3,6,8,29,1,2,4,7,8};
		String output="";
		//order-->1,2,3,4,6,7,8,29
		Set<Integer> num=new LinkedHashSet<Integer>();
		for (int i = 0; i < data.length; i++) {
			if(!num.add(data[i]))
				output=output+data[i];
			
		}
		System.out.println(num);
		System.out.println("Duplicate values:" +output);
	}

}
