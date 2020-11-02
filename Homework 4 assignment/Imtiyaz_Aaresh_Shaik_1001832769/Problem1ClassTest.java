package Homework4;

import static junitparams.JUnitParamsRunner.$;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class Problem1ClassTest {
	
	private Problem1Class problem1;
	
	@SuppressWarnings("unused")
	private static final Object[] parametersProblem1ClassTest () {
		return $(
				//Parameters are: (1,2,3)
//						1=AGL,2=motorStates,3=chuteStates
//				Test case 1
				$(7_500.2,   Problem1Class.motorStates.Off,	Problem1Class.chuteStates.Off),
//				Test case 2
				$(4_100.2,   Problem1Class.motorStates.RB5,	Problem1Class.chuteStates.Off),
//				Test case 3
				$(2_250.1,   Problem1Class.motorStates.RB4,	Problem1Class.chuteStates.Off),
//				Test case 4
				$(1_100.2,   Problem1Class.motorStates.RB3,	Problem1Class.chuteStates.Off),
//				Test case 5
				$(4_00.2,   Problem1Class.motorStates.RB2,	Problem1Class.chuteStates.Deployed),
//				Test case 6
				$(2_50.1,   Problem1Class.motorStates.RB2,	Problem1Class.chuteStates.Released),
//				Test case 7
				$(0.1,   Problem1Class.motorStates.RB1,	Problem1Class.chuteStates.Released),
//				Test case 8
				$(0.0,   Problem1Class.motorStates.Off,	Problem1Class.chuteStates.Released),
//				Test case 9
				$(250.0,   Problem1Class.motorStates.RB1,	Problem1Class.chuteStates.Released),
//				Test case 10
				$(400.1,   Problem1Class.motorStates.RB2,	Problem1Class.chuteStates.Released),
//				Test case 11
				$(1_100.1,   Problem1Class.motorStates.RB2,	Problem1Class.chuteStates.Deployed),
//				Test case 12
				$(2_250.0,   Problem1Class.motorStates.RB3,	Problem1Class.chuteStates.Off),
//				Test case 13
				$(4_100.1,   Problem1Class.motorStates.RB4,	Problem1Class.chuteStates.Off),
//				Test case 14
				$(7_500.1,   Problem1Class.motorStates.RB5,	Problem1Class.chuteStates.Off),
//				Test case 15
				$(10_000.0,   Problem1Class.motorStates.Off,	Problem1Class.chuteStates.Off)
		);
	}

	
	@Before
	public void setUp() throws Exception {
		problem1 = new Problem1Class();
	}

	@Test
	@Parameters(method="parametersProblem1ClassTest")
	public void test(double AGL, Problem1Class.motorStates motorStates, Problem1Class.chuteStates chuteStates) {
		problem1.controlLanding(AGL);
		assertEquals(motorStates, problem1.getMs());
		assertEquals(chuteStates, problem1.getCs());
	}

}
