package Homework5;

import static junitparams.JUnitParamsRunner.$;
import static org.junit.Assert.*;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("unused")
@RunWith(JUnitParamsRunner.class)

public class Problem2ClassTest {
	private Problem2Class newp2;
	@Before
	public void setUp() throws Exception {
		 newp2 = new Problem2Class();
	}
 
	@Test
	@FileParameters("src/newp2.csv")	
	public void test(int testcasenum, int boxInCarNum, int rrCarNum, int shipmentNum,int boxSum, String Basispt, String comments) {
		newp2.calcPrevBoxNumber(boxInCarNum, rrCarNum, shipmentNum);
		
	}

}
