package JUnit4Printtokens;

import static org.junit.Assert.*;
import java.io.*;

import org.junit.Test;

public class get_token_test {
	
	@Test
	public void test1() {
		BufferedReader br = null;
		String fname = "JUnit4Printtokens/test.txt";
		try{
			FileReader fr = new FileReader(fname);
			br = new BufferedReader(fr);
		}
		catch (IOException e) {
			System.out.print("The file" + fname + "doesn't exists\n");
			e.printStackTrace();
		}
		
		Printtokens test = new Printtokens();
		String tok = test.get_token(br);
		assertEquals("and", tok);
	}
	
	@Test
	public void test2() {
		String s = "";
		Reader r = new StringReader(s);
		BufferedReader br = new BufferedReader(r);
		Printtokens test = new Printtokens();
		String tok = test.get_token(br);
		assertEquals(null, tok);
	}
	
	@Test
	public void test3() {
		String s = "(";
		Reader r = new StringReader(s);
		BufferedReader br = new BufferedReader(r);
		Printtokens test = new Printtokens();
		String tok = test.get_token(br);
		assertEquals("(", tok);
	}

	@Test
	public void test4() {
		String s = ";";
		Reader r = new StringReader(s);
		BufferedReader br = new BufferedReader(r);
		Printtokens test = new Printtokens();
		String tok = test.get_token(br);
		assertEquals(";", tok);
	}
	
	@Test
	public void test5() {
		String s = "z\r z";
		Reader r = new StringReader(s);
		BufferedReader br = new BufferedReader(r);
		Printtokens test = new Printtokens();
		String tok = test.get_token(br);
		assertEquals("z", tok);
	}
	
	@Test
	public void test6() {
		String s = "\'or";
		Reader r = new StringReader(s);
		BufferedReader br = new BufferedReader(r);
		Printtokens test = new Printtokens();
		String tok = test.get_token(br);
		assertEquals("\'or", tok);
	}
	@Test
	public void test7() {
		String s = "lambda,";
		Reader r = new StringReader(s);
		BufferedReader br = new BufferedReader(r);
		Printtokens test = new Printtokens();
		String tok = test.get_token(br);
		assertEquals("lambda", tok);
	}
	@Test
	public void test8() {
		String s = "xor(";
		Reader r = new StringReader(s);
		BufferedReader br = new BufferedReader(r);
		Printtokens test = new Printtokens();
		String tok = test.get_token(br);
		assertEquals("xor", tok);
	}
	
	
}
