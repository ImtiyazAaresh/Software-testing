package Homework4;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class Problem3ClassTest {

	private Problem3Class prob3;
	@Before
	public void setUp() throws Exception {
		prob3 = new Problem3Class();
	}


	@Test
	@FileParameters("src/Homework4/Problem3TestCaseInput.csv")	
	public void test(int testcaseNumber,boolean prime, int memberPoints, double total,boolean Return,String bpNumber) {
//		problem3.approveCart(prime,memberPoints,total);
		assertEquals(Return, prob3.approveCart(prime, memberPoints, total));
	}

}
