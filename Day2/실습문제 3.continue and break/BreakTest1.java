class BreakTest1
{
	public static void main(String[] args)
	{
		int i = 1, sum = 0;
		for(i=1;true;i++)
		{
			sum += i;
			if(sum>5000)	
			{					
				System.out.println(sum);
				break;				
			}
		}
	}
}			