package Homework4;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class Problem2ClassTest {

	private Problem2Class prob2;
	private Problem2ClassAlarm alarm;

	@Before
	public void setUp() throws Exception {
		prob2 = new Problem2Class();
		alarm = new Problem2ClassAlarm();
	}



	@Test
	@FileParameters("src/Homework4/Problem2input.csv")
	public void test(int testcaseNumber,double batteryLevel,boolean red,boolean yellow,boolean green,boolean strobe,boolean bell,String bp) {
		prob2.calcLights(batteryLevel,alarm);
		assertEquals(red,alarm.isRedLight());
		assertEquals(yellow,alarm.isYellowLight());
		assertEquals(green,alarm.isGreenLight());
		assertEquals(strobe,alarm.isStrobe());
		assertEquals(bell,alarm.isBell());
	}

}
