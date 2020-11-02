package Homework5;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class Problem3ClassTest {

	private Problem3ClassModified problem3;
	
	@Before
	public void setUp() throws Exception {
		problem3 = new Problem3ClassModified();
	}

	@Test
	@FileParameters("src/Homework5/Problem3input.csv")
	public void test(int testcaseNumber, Problem3ClassModified.state currentState, Problem3ClassModified.state nextState , int D, int G, int P, int Z, int B, int I, int T, int X) {
		problem3.operateBinoculars(currentState, D, G, P, Z);
		assertEquals(B, problem3.getB());
		assertEquals(I, problem3.getI());
		assertEquals(T, problem3.getT());
		assertEquals(X, problem3.getX());
		assertEquals(nextState, problem3.getNextState());
		
	}

}
