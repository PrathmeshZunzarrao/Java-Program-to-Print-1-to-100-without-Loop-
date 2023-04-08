class Print_Numbers 
{
	public static void main(String[] args) 
	{
		int num = 1;
		printnum(num);
	}

	public static void printnum(int num)
	{
		if (num <= 100)
		{
			System.out.print(num + " ");
			printnum(num + 1);
		}

	}
}
