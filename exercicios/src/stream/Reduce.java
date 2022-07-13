package stream;

import java.util.Arrays;
import java.util.List;

public class Reduce {
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		nums.stream().reduce((acc, n) -> acc + n);
	}
}
