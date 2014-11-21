package ElevenToTwenty;

public class ProjectTwelve {
	
	public static void main(String[] args) {
		int x = 1, sum = 0;
		int divisors = 0;
		
		while (!(divisors > 500)) {
			sum += x;
			
			divisors = 0;
			
			for (int i=1; i<Math.sqrt(sum) +1;i++)
				if (sum % i == 0)
					divisors+= 2;
			
			if (sum % (int) Math.sqrt(sum) == 0)
				divisors++;
			
			x++;
		}
		
		System.out.println("Answer: " + (x -1) + "th number: " + sum);
	}
}