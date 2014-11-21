package OneToTen;
import java.util.ArrayList;


public class ProjectTwo {
	
	private static int max = 4000000;

	public static void main(String[] args) {
		
		int sum = 0;
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(0);
		al.add(1);
		
		while (true) {
			
			int nextNum = al.get(al.size() - 1) + al.get(al.size() - 2);
			
			if (nextNum % 2 == 0)
				sum += nextNum;
			
			if (nextNum < max) {
				al.add(nextNum);
				al.remove(0);
			} else {
				break;
			}
		}
		
		System.out.println(sum);

	}

}
