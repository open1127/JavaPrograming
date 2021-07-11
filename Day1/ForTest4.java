class ForTest4
{
	public static void main(String[] args)
	{
		int i=7, sum =0, cnt=0;
		for(i=7;sum<=1000;i=i+7)
		{
			sum = sum+i;
			cnt = cnt +1;
			System.out.println(cnt+" "+ i + " " +sum+" ");
		}
	}
}
