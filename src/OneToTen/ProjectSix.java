package OneToTen;

public class ProjectSix {

	public static void main(String[] args) {
		int sumOfSquares = 0;
		int squareOfSum = 0;
		
		for (int i=1;i<=100;i++) {
			sumOfSquares += Math.pow(i, 2);
			squareOfSum += i;
		}
		
		squareOfSum = (int) Math.pow(squareOfSum, 2);
		
		System.out.println(sumOfSquares - squareOfSum);
	}

}
