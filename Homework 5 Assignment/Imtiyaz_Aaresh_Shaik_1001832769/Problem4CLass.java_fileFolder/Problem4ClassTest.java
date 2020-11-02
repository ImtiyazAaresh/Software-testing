package Homework5;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class Problem4ClassTest {

	private Problem4Class problem4;
	
	@Before
	public void setUp() throws Exception {
		problem4 = new Problem4Class();
	}

	@Test
	@FileParameters("src/Homework5/Problem4input1.csv")
	public void test(int testCaseNumber, double cart, boolean validCode, boolean validDigitalCoupon, boolean loyaltyCard, double result, String bPath,String MCDC) {
		assertEquals(result,problem4.calcCart(cart, loyaltyCard, validCode, validDigitalCoupon),0.01);
	}

}
