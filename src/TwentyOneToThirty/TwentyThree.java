package TwentyOneToThirty;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;

public class TwentyThree {

	public static void main(String[] args) {
		//Calculate abundant numbers under 28123
		
		ArrayList<Integer> abNums = new ArrayList<Integer>();
		
		for (int i=12;i<=28123;i++) {
			int sum = 0;
			
			for (int j=1;j<=i/2;j++)
				if (i % j == 0)
					sum += j;

			if (sum > i)
				abNums.add(new Integer(i));
		}
		
		//Find all sums of abundant numbers
		
		ArrayList<Integer> sums = getSums(abNums);
		Collections.sort(sums);
		
		BigInteger sum = new BigInteger("0");

		int index = 0;
		int temp = sums.get(index);
		
		for (int i=1;i<=28123;i++) {
			if (i == temp && index < sums.size() -1) {
				index++;
				temp = sums.get(index);
			} else
				sum = sum.add(new BigInteger(Integer.toString(i)));
			System.out.println(i);
		}
		
		System.out.println(sum);
	}
	
	public static ArrayList<Integer> getSums(ArrayList<Integer> al) {
		ArrayList<Integer> temp = new ArrayList<Integer>();
		
		for (int i=1;i<al.size();i++)
			for (int j=i;j<al.size();j++) {
				if (i + j < 28123)
					temp.add(new Integer(i + j));
				else
					return temp;
			}
		
		return temp;
	}
}