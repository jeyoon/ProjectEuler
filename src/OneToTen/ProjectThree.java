package OneToTen;

public class ProjectThree {

	public static void main(String[] args) {
		long x = 600851475143L;
		long i = 2L;
		
		while(i < x)
			if (x % i == 0)
				x = x/i;
			else
				i++;
		
		System.out.println(x);

	}

}
