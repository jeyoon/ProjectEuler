package OneToTen;
import java.util.ArrayList;


public class ProjectFour {
	
	public static void main(String[] args) {
		
		int a = 999, b = 999;
		
		Integer product, result;
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		do {
			product = new Integer(a * b);
			result = checkInteger(product);
			
			if (a > 2)
				a--;
			else {
				b--;
				a = b;
			}
			
			if (result.intValue() != -1)
				al.add(result);
		} while (a != 1 && b != 1);
		
		int answer = 0;
		
		for (Integer i:al)
			if (i.intValue() > answer)
				answer = i.intValue();
		
		System.out.println(answer);
	}
	
	private static Integer checkInteger(Integer num) {
		char[] str = num.toString().toCharArray();
		
		for (int offset=0;offset<str.length;offset++)
			if (str[offset] != str[str.length -1 -offset])
				return -1;
		
		return new Integer(new String(str));
	}

}