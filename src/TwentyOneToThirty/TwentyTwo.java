package TwentyOneToThirty;

import java.io.IOException;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class TwentyTwo {

	public static void main(String[] args) {
		HashMap<Character, Integer> hm = new HashMap<>();
		hm.put('A', 1);hm.put('B', 2);hm.put('C', 3);hm.put('D', 4);hm.put('E', 5);hm.put('F', 6);hm.put('G', 7);hm.put('H', 8);hm.put('I', 9);
		hm.put('J', 10);hm.put('K', 11);hm.put('L', 12);hm.put('M', 13);hm.put('N', 14);hm.put('O', 15);hm.put('P', 16);hm.put('Q', 17);
		hm.put('R', 18);hm.put('S', 19);hm.put('T', 20);hm.put('U', 21);hm.put('V', 22);hm.put('W', 23);hm.put('X', 24);hm.put('Y', 25);hm.put('Z', 26);
		
		String[] names = null;
		
		try {
			names = new String(Files.readAllBytes(Paths.get("p022_names.txt"))).replace("\"", "").split(",");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Arrays.sort(names);
		
		BigInteger sum = new BigInteger("0");
		
		for (int i=0;i<names.length;i++) {
			int value = 0;
			
			for (int j=0;j<names[i].length();j++) {
				value += hm.get(names[i].charAt(j));
			}
			System.out.println("Value:" + value);
			sum = sum.add(new BigInteger(Integer.toString(value * (i +1))));
		}
		
		System.out.println(sum);
	}
}