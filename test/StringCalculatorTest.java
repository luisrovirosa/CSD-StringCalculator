import static org.junit.Assert.*;

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
	}

}
