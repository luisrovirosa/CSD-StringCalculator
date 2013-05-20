import java.util.StringTokenizer;

public class StringCalculator {

	public int add(String numbers) {
		if (numbers.isEmpty()) {
			return 0;
		}

		String delimiters = ",\n";

		if (numbers.startsWith("//")) {
			String delimeter = numbers.substring(3, 4);
			delimiters = delimiters + delimeter;
			numbers = numbers.substring(5);
		}

		StringTokenizer st = new StringTokenizer(numbers, delimiters);
		int suma = 0;
		while (st.hasMoreElements()) {
			suma = suma + Integer.parseInt(st.nextToken());
		}
		return suma;

	}
}
