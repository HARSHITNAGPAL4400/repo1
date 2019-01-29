class ThrowExample{
	public static void main (String args[])
	{
		try
		{
			throw new ArithmeticException("exception thrown using throw");
		}
		catch(ArithmeticException e)
		{
			System.out.print(e.toString());   //displays the object in the form of string
			System.out.print(e.getMessage());
		}
		finally
		{
			System.out.print("finally");
		}
	}
}