class ContinueTest1
{
	public static void main(String[] args)
	{
		for(int i=1;i<=20;i++)
		{
			if(i%2==0 || i%3==0) continue;
			System.out.print(i+" ");
		}
	}
}
				