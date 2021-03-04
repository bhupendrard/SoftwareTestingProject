package JUnit4Printtokens;

import static org.junit.Assert.*;

import org.junit.Test;

public class is_keyword_test {

	@Test
	public void test1() {
		boolean boo = Printtokens.is_keyword("and");
		assertEquals(true, boo);
	}
	
	@Test 
	public void test2()
	{
		boolean boo = Printtokens.is_keyword("or");
		assertEquals(true, boo);
	}

	@Test 
	public void test3()
	{
		boolean boo = Printtokens.is_keyword("if");
		assertEquals(true, boo);
	}
	
	@Test 
	public void test4()
	{
		boolean boo = Printtokens.is_keyword("xor");
		assertEquals(true, boo);
	}
	@Test
	public void test5()
	{
		boolean boo = Printtokens.is_keyword("lambda");
		assertEquals(true, boo);
	}
	@Test
	public void test6()
	{
		boolean boo = Printtokens.is_keyword("=>");
		assertEquals(true, boo);
	}
	@Test
	public void test7()
	{
		boolean boo = Printtokens.is_keyword("aaa");
		assertEquals(false, boo);
	}

	@Test
	public void test8()
	{
		boolean boo = Printtokens.is_keyword("#aaa");
		assertEquals(false, boo);
	}

	@Test
	public void test9()
	{
		boolean boo = Printtokens.is_keyword(";aaa");
		assertEquals(false, boo);
	}
}
