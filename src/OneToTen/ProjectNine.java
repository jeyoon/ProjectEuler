package OneToTen;

public class ProjectNine {

	public static void main(String[] args) {
		long startTime = System.nanoTime();
		int a=1,b=1,c=998;
		boolean isPythag = false;
		
		while (true) {
			isPythag = Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2);
			
			if (isPythag)
				break;
			
			if (c-b > 2) {
				b++;
				c--;
			} else {
				b=1;
				a++;
				c = 1000 - a - b;
			}
		}
		
		System.out.println("A: " + a + " B: " + b + " C: " + c);
		System.out.println(a*b*c);

		long endTime = System.nanoTime();
		System.out.println("Took " + (endTime - startTime) * 10E-9 + " seconds"); 
	}

}
