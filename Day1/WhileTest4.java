class WhileTest4
{
	public static void main(String[] args)
	{
		int i= 7, sum=0, cnt=0;
		while(sum<=1000)
		{
			sum=sum+i;
			cnt=cnt+1;
			System.out.println(cnt+" " +i+" "+ sum+" ");
			i= i+7;
		}
	}
}
