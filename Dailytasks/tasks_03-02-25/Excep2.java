package excep;

class Excep2 {
	public static void checkeven(int n) throws Exception{
		if(n%2!=0)
		{
			System.out.println("num is odd");
		}
		else
		{
			System.out.println("num is even");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			checkeven(5);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
