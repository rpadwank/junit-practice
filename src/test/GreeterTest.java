package test;

import org.junit.Test;
import static org.junit.Assert.*;
import main.Greeter;

public class GreeterTest
{
	@Test
	public void testGreeter()
	{
		Greeter greeter = new Greeter();
		assertEquals("Hell", greeter.greet());
	}
}