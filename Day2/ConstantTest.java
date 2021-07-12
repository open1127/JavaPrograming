class ConstantTest 상수
{
	public static void main(String[] args)
	{
		final int MAX = 5;		// 마지막 상수 초기화는 단 한번만 이루어진다.
		/*
		final int MAX;
		MAX = 5;
		*/
		int i=0;

		for(i=0;i<MAX;i++)		//MAX로 상수를 기호화함
		{
			System.out.println("Hello");
		}
	}
}
>>symbolic constant 심볼릭 상수
상수를 기호화하여 이름을 가지고 있는 상수
final 키워드로 선언
심볼릭 상수는 변수이름 전체를 대문자로 쓴다. 
소문자도 오류는 아니지만 개발자들의 암묵적인 약속 -->가독성
