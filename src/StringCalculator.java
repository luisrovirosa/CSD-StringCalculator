public class StringCalculator {

	public int add(String numbers) {
		if (numbers.isEmpty()) {
			return 0;
		}

		int posComma = numbers.indexOf(",");
		if (-1 != posComma) {
			int left = Integer.parseInt(numbers.substring(0, posComma));
			int right = Integer.parseInt(numbers.substring(posComma + 1));
			return left + right;
		}

		return Integer.parseInt(numbers);
	}
}
