class TimesTable4
{
	public static void main(String[] args)
	{
		int i=2, j=1;
		for(i=2;i<=9;i=i+2)
		{
			for(j=1;j<=i;j++)
			{
				System.out.println(i + " * " + j + " = " + i*j);
			}
			System.out.println();
		}
	}
}