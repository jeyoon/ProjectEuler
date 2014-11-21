package OneToTen;

public class ProjectFive {
	
	public static void main(String[] args) {
		
		boolean isAnswer = false;
		
		for (int i=2520;;i+=2) {
			isAnswer = true;
			
			for (int j=1;j<=20;j++)
				if (i % j != 0) {
					isAnswer = false;
					break;
				}
			
			if (isAnswer) {
				System.out.println(i);
				break;
			}
		}
		
	}
}