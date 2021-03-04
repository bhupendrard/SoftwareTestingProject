package JUnit4Printtokens;

import static org.junit.Assert.*;

import org.junit.Test;

public class is_identifier_test {

	
	
	@Test
	public void test1() {
		boolean boo = Printtokens.is_identifier("a1");
		assertEquals(true, boo);
	}
	
	@Test
	public void test2() {
		boolean boo = Printtokens.is_identifier("1aa");
		assertEquals(false, boo);
	}
	
	@Test
	public void test3() {
		boolean boo = Printtokens.is_identifier("a1a");
		assertEquals(true, boo);
	}
	
	@Test
	public void test4() {
		boolean boo = Printtokens.is_identifier("a1;");
		assertEquals(false, boo);
	}
}
