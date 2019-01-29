class MyException extends Exception
{
	private int detail;
	MyException(int a)
	{
		detail=a;

	}
		public String tostring(){
			return "MyException[" + detail + "]";
		}
}
class CustomException
{
	static void compute(int a) throws MyException{
		System.out.print("CalledCompute(" + a + ")");
		if(a>10)
		throw new MyException(a);
		System.out.print("NormalExist");
	}
	public static void main(String args[]){
		try{
			compute(1);
			compute(20);
		}
		catch(MyException e){
			System.out.print("caught" + e);
		}
	}
}