package practiceclass;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.mits.calculator;

public class calculatortest {
	@Test
	public void Testadd() {
		assertEquals(5,calculator.add(2,3));
		assertEquals(-1,calculator.add(2,-3));
	}
	@Test
	public void Testsubstract() {
		assertEquals(2,calculator.substract(5,3));
		assertEquals(8,calculator.substract(5,-3));
	}
	@Test
	public void Testmultiply() {
		assertEquals(6,calculator.multiply(2,3));
		assertEquals(-6,calculator.multiply(2,-3));
	}
	@Test
	public void Testdivide() {
		assertEquals(0.5,calculator.divide(2,4), 0.001);
		
	}

}
