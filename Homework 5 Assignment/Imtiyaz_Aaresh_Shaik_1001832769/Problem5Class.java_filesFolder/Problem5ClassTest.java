package Homework5;

import static org.junit.Assert.assertEquals;

import org.easymock.EasyMock;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class Problem5ClassTest {
	
	Problem5Class problem5;
	Problem5ServerData mockobj;
	
	@Before
	public void setUp() throws Exception {
		problem5 = new Problem5Class();
		mockobj = EasyMock.strictMock(Problem5ServerData.class);
	}
	

	@Test
	@FileParameters("src/Homework5/Problem5input.csv")
	public void test(int testCaseNumber, double cart,boolean loyaltyCard, boolean validCode, boolean validDigitalCoupon, double result, String bPath,String mcdc) {
		EasyMock.expect(mockobj.getCart()).andReturn(cart);
		EasyMock.replay(mockobj);
		double expected = problem5.calcCart(mockobj, loyaltyCard, validCode, validDigitalCoupon);
		assertEquals(result,expected,0.01);
	}

}
