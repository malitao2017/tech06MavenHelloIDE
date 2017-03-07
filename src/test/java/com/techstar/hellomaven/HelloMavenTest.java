package com.techstar.hellomaven;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class HelloMavenTest{
	
	@Test
	public void testSayHello(){
		HelloMaven hm = new HelloMaven();
		String test = hm.sayHello();
		assertEquals("Hello Maven",test);
	}
	
}

