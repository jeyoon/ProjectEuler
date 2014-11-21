package ElevenToTwenty;

import java.math.BigInteger;

public class ProjectSixteen {

	public static void main(String[] args) {
		BigInteger num = new BigInteger("1");
		BigInteger factor = new BigInteger("2");
		
		for (int e=1;e<=1000;e++)
			num = num.multiply(factor);
		
		String str = num.toString();
		int sum = 0;
		
		for (int i=0;i<str.length();i++)
			sum += Integer.parseInt(str.substring(i, i+1));
		
		System.out.println("Answer: " + sum);
	}

}
