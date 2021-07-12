class BreakTest2
{
	public static void main(String[] args)
	{
		int i = 1;
		for(i=1;true;i++)
		{
			if(i%5==0 && i%7==0)
			{
				System.out.println(i);
				break;
			}
		}		
	}
}
