package project;

import static org.junit.Assert.*;

import org.junit.Test;

public class testcase {

	@Test
	public void test() {
		addition mytest = new addition();
		int value = mytest.sum(10, 20);
		int result = 30;
		assertEquals(result,value);
	}

}
