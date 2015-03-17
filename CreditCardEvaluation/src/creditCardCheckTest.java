import static org.junit.Assert.*;

import org.junit.Test;


public class creditCardCheckTest {

	@Test
	public void testCardNumber() {
		Junit test = new Junit();
		int validation = test.CardNumber(1234567812345678);
		assertEquals("invalid", validation);
		
	}

}
