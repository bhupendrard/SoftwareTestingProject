package JUnit4Printtokens;

import static org.junit.Assert.*;

import org.junit.Test;

public class is_token_end_test {
	@Test
	public void test1() {		
		 
		boolean boo = Printtokens.is_token_end(0,-1);
		assertEquals(true, boo);				
	}
	
	@Test
	public void test2()
	{
		 
		boolean boo = Printtokens.is_token_end(1,10);
		assertEquals(true, boo);	
	}
	
	@Test
	public void test3()
	{
		 
		boolean boo = Printtokens.is_token_end(1,50);
		assertEquals(false, boo);	
	}
	
	@Test
	public void test4()
	{		 
		boolean boo = Printtokens.is_token_end(2,10);
		assertEquals(true, boo);	
	}
	
	@Test
	public void test5()
	{		 
		boolean boo = Printtokens.is_token_end(2,50);
		assertEquals(false, boo);	
	}
	
	
	
	@Test 
	public void test6()
	{		 
		boolean boo = Printtokens.is_token_end(3,10);
		assertEquals(true, boo);	
	}
	
	@Test
	public void test7() {		
		 
		boolean boo = Printtokens.is_token_end(3,40);
		assertEquals(true, boo);				
	}
	
	@Test
	public void test8()
	{		 
		boolean boo = Printtokens.is_token_end(3,60);
		assertEquals(false, boo);	
	}

}
