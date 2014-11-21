package ElevenToTwenty;

import java.math.BigInteger;

public class ProjectTwenty {

	public static void main(String[] args) {
		String num = "100";
		
		BigInteger factorial = new BigInteger(num);
		
		for (int i=Integer.parseInt(num) -1;i>0;i--)
			factorial = factorial.multiply(new BigInteger(Integer.toString(i)));
		
		String str = factorial.toString();
		int sum = 0;
		
		for (int i=0;i<str.length();i++)
			sum += Integer.parseInt(str.substring(i, i+1));
		
		System.out.println(sum);

	}

}
