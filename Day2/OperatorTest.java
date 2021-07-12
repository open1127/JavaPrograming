class OperatorTest 
{
	public static void main(String[] args)
	{
		int num1 = 10, num2 = 10, num3 =10;
		int result1 = 0, result2 = 0;
		
		result1 = ++num1;		//선치: 증감연산자가 앞에 있을때 증감후값이 대입됨
		result2 = num2++;		//후치: 증감연산자가 뒤에 있을때 증감전값이 대입됨

		System.out.println("num1 = " + num1 + " num2 = " + num2); 		//11 11
		System.out.println("result1 = " + result1 + " result2 = " + result2);	//11 10
		System.out.println("num3++ " + num3++);					//10
		System.out.println("num3 " + num3);					//11
	}
}

