class ContinueTest2
{
	public static void main(String[] args)
	{
		int cnt = 0;
		for(int i=1;i<=100;i++)
		{
			if(i%5!=0 || i%7!=0) continue;
			cnt++;
			System.out.println(cnt + " " + i);
		}
	}	
}