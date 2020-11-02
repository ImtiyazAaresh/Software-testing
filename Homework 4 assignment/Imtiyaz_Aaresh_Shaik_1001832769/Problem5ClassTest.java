package Homework4;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
@RunWith(JUnitParamsRunner.class)
public class Problem5ClassTest {

	private Problem5Class prob5;

	@Before
	public void setUp() throws Exception {
		prob5 = new Problem5Class();
	}



	@Test
	@FileParameters("src/Homework4/Problem5input.csv")
	public void test(int testcaseNumber,double x,double y,String bp) {
		assertEquals(y, prob5.calcY(x), 0.001);
	}

}
