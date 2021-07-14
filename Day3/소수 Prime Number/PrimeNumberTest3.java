class PrimeNumberTest3
{
	public static void main(String[] args)
	{
		int num=0, i=0;

		for(num=2;num<=100;num++)
		{
			for(i=2;i<num;i++)
			{
				if(num%i==0) break;
			}
			if(num == i) System.out.println(num);
		}
	}
}