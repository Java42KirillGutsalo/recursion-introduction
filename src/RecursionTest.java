import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RecursionTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test() {
		f(50);
	}

	private void f(int a) {
		if(a > 3) {
			int b = a - 1;
			f(b);
		}
	}
	
	@Test
	void factorialTest() {
		assertEquals(24, RecursionAppl.factorial(4));
		assertEquals(1, RecursionAppl.factorial(0));
		boolean fl = false;
		try {
			RecursionAppl.factorial(-100);
		} catch (IllegalArgumentException e) {
			fl = true;
		}
		assertTrue(fl);
	}
	
	//@Test
	void powTest() {
		assertEquals(4, RecursionAppl.pow(-2, 2));
		assertEquals(4, RecursionAppl.pow(2, 2));
		assertEquals(-8, RecursionAppl.pow(-2, 3));
		assertEquals(8, RecursionAppl.pow(2, 3));
		boolean fl = false;
		try {
			RecursionAppl.pow(10, -10);
		} catch (IllegalArgumentException e) {
			fl = true;
		}
		assertTrue(fl);
	}
	
	@Test
	void sumTest() {
		assertEquals(10, RecursionAppl.sum(new int[] {30, 20, -40}));
		assertEquals(0, RecursionAppl.sum(new int[0]));
	}
	
	@Test
	void squareTest() {
		assertEquals(4, RecursionAppl.square(2));
		assertEquals(4, RecursionAppl.square(-2));
		assertEquals(100, RecursionAppl.square(10));
	}
}
