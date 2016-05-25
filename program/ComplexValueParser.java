package program;

public class ComplexValueParser {

	public static ComplexValue parse(String value)
	{
		try	{
			String s[] = value.split("[\\Q+-\\Ei]");
			int[] factors = new int[2];
			if (value.charAt(0) == '-') {
				factors[0] = (-1);
				value = value.substring(1, value.length() - 2);
			} else {
				factors[0] = 1;
			}
			factors[1] = (value.indexOf("-") >= 0)
					? (-1)
					: 1
					;
			
			Double[] values = new Double[2];
			int idx = s.length - 1;
			int numbersLeft = 2;
			while (idx >= 0 && numbersLeft > 0) {
				values[numbersLeft - 1] = 
						Double.parseDouble(s[idx]) * factors[numbersLeft - 1];
				
				--idx;
				--numbersLeft;
			}
			
			return new ComplexValue(values[0], values[1]);
		}
		catch(Exception ex)
		{
			System.err.println("ComplexValueParser err: " + ex.getMessage());
			return null;
		}
	}
	
}
