package OneToTen;

import java.util.ArrayList;

public class ProjectTen {

	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(2);
		al.add(3);
		
		int num;
		int offset = 2;
		
		while (true) {
			num = al.get(al.size() -1) + offset;
			
			if (num > 2000000)
				break;
			
			boolean isPrime = true;
			
			for (int i=3;i<(num/2) +1;i+=2)
				if (num % i == 0) {
					isPrime = false;
					break;
				}
			
			if (isPrime) {
				al.add(num);
				offset = 2;
			} else
				offset += 2;
		}
		
		float sum = 0;
		for (int i:al)
			sum += i;
		
		System.out.printf("%f ", sum);
		System.out.println(al.get(al.size() -1));
		long endTime = System.nanoTime();
		System.out.println("Took " + (endTime - startTime) * 10E-9 + " seconds");
		
		//TODO does not work
	}
}