package program;

import java.lang.Comparable;

public class ComplexValue {

	public Double re;
	public Double im;
	
	public ComplexValue(Double _re, Double _im)
	{
		re = _re;
		im = _im;
	}
	
	public boolean equals(Object rhs)
	{
		return re.equals( ((ComplexValue)rhs).re ) && im.equals( ((ComplexValue)rhs).im );
	}
	
}
