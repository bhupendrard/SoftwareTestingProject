package JUnit4Printtokens;

import static org.junit.Assert.*;

import org.junit.Test;

public class is_str_constant_test {

	
	
	
	@Test
	public void test1() {
		boolean boo = Printtokens.is_str_constant("\"asd\"");
		assertEquals(true, boo);
	}
	
	@Test
	public void test2() {
		boolean boo = Printtokens.is_str_constant("abc");
		assertEquals(false, boo);
	}
		

	@Test
	public void test3() {
		boolean boo = Printtokens.is_str_constant("\"asd");
		assertEquals(false, boo);
	}


	
	@Test
	public void test4() {
		boolean boo = Printtokens.is_str_constant("\"123\"");
		assertEquals(true, boo);
	}
	
	@Test
	public void test5() {
		boolean boo = Printtokens.is_str_constant(";123");
		assertEquals(false, boo);
	}
}
