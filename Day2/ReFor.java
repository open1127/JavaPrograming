class ReFor
{
	public static void main(String[] args)
	{
		int i=0;
		for(i=0;true;i++)	//조건이 true 참
		{
			System.out.println("Hello");
		}
	}
}

class ReFor2
{
	public static void main(String[] args)
	{
		int i=0;
		for( ; ; )	// for 빈 구문 실행됨
		{
			System.out.println("Hello");
		}
	}
}