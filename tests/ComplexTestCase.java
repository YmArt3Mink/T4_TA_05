package tests;

import program.ComplexValueParser;
import program.ComplexValue;

import static org.junit.Assert.*;
import org.junit.Test;

public class ComplexTestCase {

	@Test
	public void TestParsePosPos()
	{
		assertEquals(
				new ComplexValue(new Double(300), new Double(400)),
				ComplexValueParser.parse("300+400i")
				);
	}
	
	@Test
	public void TestParsePosNeg()
	{
		assertEquals(
				new ComplexValue(new Double(300), new Double(-400)),
				ComplexValueParser.parse("300-400i")
				);
	}
	
	@Test
	public void TestParseNegPos()
	{
		assertEquals(
				new ComplexValue(new Double(-300), new Double(400)),
				ComplexValueParser.parse("-300+400i")
				);
	}
	
	@Test
	public void TestParseNegNeg()
	{
		assertEquals(
				new ComplexValue(new Double(-300), new Double(-400)),
				ComplexValueParser.parse("-300-400i")
				);
	}
	
}
