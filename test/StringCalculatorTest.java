import static org.junit.Assert.*;

import org.junit.Test;


public class StringCalculatorTest {

	@Test
	public void returnsZeroWhenEmptyString() throws Exception {
		StringCalculator calc = new StringCalculator();
		assertEquals(0, calc.add(""));
	}

}
