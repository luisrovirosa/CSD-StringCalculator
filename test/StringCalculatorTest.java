import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

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
	}

	@Test
	public void returnsSumWhenMultipleCommaSeparatedNumbers() throws Exception {
		assertEquals(23, calc.add("0,23"));
		assertEquals(6, calc.add("1,2,3"));
	}

	@Test
	public void returnsSumWhenMultipleTokenSeparatedNumbers() throws Exception {
		assertEquals(6, calc.add("1\n2,3"));
		assertEquals(6, calc.add("1,2\n3\n"));
	}

	@Test
	public void returnsSumWhenMultipleTokenAndSpecifiedTokenSeparatedNumbers()
			throws Exception {
		assertEquals(3, calc.add("//[;]\n1;2"));
		assertEquals(6, calc.add("//[&]\n1,2&3"));
	}

	@Test(expected = Exception.class)
	public void throwsExceptionWhenNegative() throws Exception {
		calc.add("-1");
	}

	@Test
	public void throwsExceptionWhenNegativeMessage() {
		String[] testCases = { "-1", "-1,8,-5", "1,8,-5", "//[;]1,-1" };
		String[][] expectedMessageException = { { "-1" }, { "-1", "-5" },
				{ "-5" }, { "-1" } };

		for (int i = 0; i < testCases.length; i++) {
			try {
				calc.add(testCases[i]);
				fail();
			} catch (Exception e) {
				assertTrue(e.getMessage().contains("no se permiten negativos"));
				for (String expectedNumber : expectedMessageException[i]) {
					assertTrue(e.getMessage().contains(expectedNumber));
				}

			}
		}

	}
}
