package lab;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Lab1Test {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testMain() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testExpression() {
		//fail("Not yet implemented");
		assertEquals(1,expression("unit_price^3   *quantity*2  -capital   	*4*x+  5  y  +6+capital*2*x"));
	}



@Test
	public void testExpression2() {
		//fail("Not yet implemented");
		assertEquals(2,expression("!simplify x=1"));
	}


@Test
	public void testExpression3() {
		//fail("Not yet implemented");
		assertEquals(3,expression("!d/d x"));
	}


@Test
	public void testExpression4() {
		//fail("Not yet implemented");
		assertEquals(0,expression("!ddd"));
	}


}
