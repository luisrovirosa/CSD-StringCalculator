import java.util.StringTokenizer;

public class StringCalculator {

	public int add(String numbers) throws Exception {
		String delimiters = ",\n";

		if (numbers.startsWith("//")) {
			do {
				int begin = numbers.indexOf("[");
				int end = numbers.indexOf("]");
				String delimeter = numbers.substring(begin, end);
				delimiters = delimiters + delimeter;
				numbers = numbers.substring(end + 1);
			} while (numbers.startsWith("["));
		}

		StringTokenizer st = new StringTokenizer(numbers, delimiters);
		int suma = 0;
		StringBuffer numbersError = new StringBuffer();
		while (st.hasMoreElements()) {
			int currentNumber = Integer.parseInt(st.nextToken());
			if (0 > currentNumber) {
				numbersError.append(currentNumber + ",");
			}
			suma = suma + currentNumber;
		}
		if (0 < numbersError.length()) {
			throw new Exception("no se permiten negativos"
					+ numbersError.toString());

		}
		return suma;

	}
}
