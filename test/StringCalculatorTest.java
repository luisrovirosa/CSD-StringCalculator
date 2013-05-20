import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringCalculatorTest {

	final StringCalculator calc = new StringCalculator();

	@Test
	public void returnsZeroWhenEmptyString() throws Exception {
		assertEquals(0, calc.add(""));
	}

	@Test
	public void returnsNumberWhenSingleString() throws Exception {
		assertEquals(1, calc.add("1"));
		assertEquals(345, calc.add("345"));
		assertEquals(0, calc.add("0"));
		assertEquals(-1, calc.add("-1"));
	}

}
