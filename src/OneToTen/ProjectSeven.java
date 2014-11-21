package OneToTen;
import java.util.ArrayList;


public class ProjectSeven {
	
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(2);
		al.add(3);
		
		int num;
		int offset = 2;
		
		while (al.size() < 10001) {
			num = al.get(al.size() -1) + offset;
			boolean isPrime = true;
			
			for (int i=3;i<num/2;i+=2)
				if (num % i == 0) {
					isPrime = false;
					break;
				}
			
			if (isPrime) {
				al.add(num);
				offset = 2;
			} else {
				offset += 2;
			}
		}
		
		System.out.println("Answer " + al.get(al.size() -1));
	}

}