package pk.cui.sc.labfinal.calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCalculator {

	@Test
	public void FindMaxTestCase1() {
		Calculator c = new Calculator();
		assertEquals(10,c.findMax(10, 2, 9));
	}
	
	@Test
	public void FindMaxTestCase2() {
		Calculator c = new Calculator();
		assertEquals(3,c.findMax(-10,2, 3) );
	}
	
	@Test
	public void FindMaxTestCase3() {
		Calculator c = new Calculator();
		assertEquals(2,c.findMax(-10,2, -3) );
	}
	
	@Test
	public void SquareTestCase1() {
		Calculator c = new Calculator();
		assertEquals(9,c.square(-3) );
	}
	
	@Test
	public void SquareTestCase2() {
		Calculator c = new Calculator();
		assertEquals(100,c.square(10) );
	}
	
	@Test
	public void SquareTestCase3() {
		Calculator c = new Calculator();
		assertEquals(64,c.square(8) );
	}

}
