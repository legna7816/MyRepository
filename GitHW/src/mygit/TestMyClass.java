package mygit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestMyClass {

	@Test  public void testLarger1() {
		assertEquals(MyClass.larger(1, 2), 2);
		}
	@Test  public void testLarger2() {
		assertEquals(MyClass.larger(2, 1), 2);
		}
	@Test  public void testAbsPositive() {
		assertEquals(MyClass.abs(1), 1);
		}
	@Test  public void testAbsZero() {
		assertEquals(MyClass.abs(0), 0);
		}
	 @Test  public void testAbsNegative() {
		 assertEquals(MyClass.abs(-1), 1);
	 	}
	 
	 
	@Test public void allSame() {
		 assertEquals(MyClass.median(1, 1, 1), 1);
		}
	@Test public void twoSame1() {
		 assertEquals(MyClass.median(2, 2, 1), 2);
		}
	@Test public void twoSame2() {
		 assertEquals(MyClass.median(2, 1, 2), 2);
		}
	@Test public void twoSame3() {
		 assertEquals(MyClass.median(2, 1, 1), 1);
		}
	@Test public void notSame1() {
		 assertEquals(MyClass.median(1, 3, 2), 2);
		}
	@Test public void notSame2() {
		 assertEquals(MyClass.median(3, 2, 1), 2);
		}
	
	
	
	
	@Test public void bin1() {
		int list[] = { 17 };
		assertEquals(MyClass.binarySearch(list, 17), 0);
	}
	@Test public void bin2() {
		int list[] = { 9, 16, 18, 30, 31, 41, 45 };
		assertEquals(MyClass.binarySearch(list, 45), 6);
	}
	@Test public void bin3() {
		int list[] = { 9, 16, 18, 30, 31, 41, 45 };
		assertEquals(MyClass.binarySearch(list, 18), 2);
	}
	@Test public void bin4() {
		int list[] = { 17, 18, 21, 23, 29, 33, 38 };
		assertEquals(MyClass.binarySearch(list, 23), 3);
	}
	@Test public void bin5() {
		int list[] = { 17, 18, 21, 23, 29, 33, 38 };
		assertEquals(MyClass.binarySearch(list, 33), 5);
	}
}
