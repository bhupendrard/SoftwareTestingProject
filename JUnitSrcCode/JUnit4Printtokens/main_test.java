package JUnit4Printtokens;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class main_test {
	ByteArrayOutputStream consolP = new ByteArrayOutputStream();
	PrintStream sout = System.out;
        
    @Before
	public void setUp() {
	    System.setOut(new PrintStream(consolP));
	   	}

	@After
	public void tearDown() {
	    System.setOut(sout);
	   	} 

	
	@Test
	public void test1() throws IOException{
		String args[] = {"JUnit4Printtokens/test.txt"};
		Printtokens.main(args);
		assertEquals("keyword,\"and\".\nbquote.\nkeyword,\"and\".\nidentifier,\"j\".\nerror,\"112A\".\n", consolP.toString());		
		
	}
	
	

}
