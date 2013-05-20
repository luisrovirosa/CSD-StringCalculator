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

	@Test
	public void returnsSumWhenTwoCommaSeparatedNumbers() throws Exception {
		assertEquals(3, calc.add("1,2"));
		assertEquals(23, calc.add("0,23"));
		assertEquals(1, calc.add("-1,2"));
	}

	@Test
	public void returnsSumWhenMultipleCommaSeparatedNumbers() {
		assertEquals(6, calc.add("1,2,3"));
	}

	@Test
	public void returnsSumWhenMultipleTokenSeparatedNumbers() {
		assertEquals(6, calc.add("1\n2,3"));
		assertEquals(6, calc.add("1,2\n3\n"));
	}

	@Test
	public void returnsSumWhenMultipleTokenAndSpecifiedTokenSeparatedNumbers() {
		assertEquals(3, calc.add("//[;]\n1;2"));
		assertEquals(6, calc.add("//[&]\n1,2&3"));
	}

}
