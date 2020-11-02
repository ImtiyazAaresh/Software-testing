package Homework4;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class Problem4ClassTest {

	private Problem4Class prob4;

	@Before
	public void setUp() throws Exception {
		prob4 = new Problem4Class();
	}



	@Test
	@FileParameters("src/Homework4/Problem4TestCaseinput.csv")
	public void test(int testcaseNumber,boolean autoclaveOn, double temperature, double pressure,Problem4Class.autoClaveEnum autoClaveEnum,String bp,String comment) {
		assertEquals(autoClaveEnum, prob4.autoClave(autoclaveOn, temperature, pressure));
	}

}
