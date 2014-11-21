package ElevenToTwenty;

public class ProjectFourteen {

	public static void main(String[] args) {
		long maxLength = 0;
		long index = 0;
		
		for (int i=1000000;i>maxLength;i--) {
			long length = 1;
			long num = i;
			
			while (num != 1) {
				length++;
				
				if (num % 2 == 0)
					num /= 2;
				else
					num = (3 * num) + 1;
			}
			
			if (length >= maxLength) {
				maxLength = length;
				index = i;
			}
			System.out.println(i);
		}
		System.out.println("Answer: " + index);//979065

	}

}
