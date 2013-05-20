import java.util.StringTokenizer;

public class StringCalculator {

	public int add(String numbers) {
		if (numbers.isEmpty()) {
			return 0;
		}

		StringTokenizer st = new StringTokenizer(numbers, ",");
		int suma = 0;
		while (st.hasMoreElements()) {
			suma = suma + Integer.parseInt(st.nextToken());
		}
		return suma;

	}
}
