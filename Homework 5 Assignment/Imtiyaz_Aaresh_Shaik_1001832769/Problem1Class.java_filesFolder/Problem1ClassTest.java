package Homework5;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class Problem1ClassTest {

	private Problem1Class problem1;
	
	@Before
	public void setUp() throws Exception {
		problem1 = new Problem1Class();
	}

	@Test
	@FileParameters("src/Homework5/Problem1input.csv")
	public void test(int testcaseNumber, boolean cruiseEngaged, double speed, double distance, boolean emerBrake, int pulseCount, String MCDC) {
		problem1.emerBrakeFunction(cruiseEngaged, speed, distance);
		assertEquals(emerBrake, problem1.isEmerBrake());
		assertEquals(pulseCount, problem1.getPulseCount());
		
	}

}
