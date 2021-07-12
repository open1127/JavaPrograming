import java.util.Scanner;

class SelectionSort
{
	public static void main(String[] args)
	{
		int num1=0, num2=0, num3=0, num4=0, num5=0, temp =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 숫자 입력");
		num1 = sc.nextInt();
		System.out.println("두번째 숫자 입력");
		num2 = sc.nextInt();
		System.out.println("세번째 숫자 입력");
		num3 = sc.nextInt();
		System.out.println("네번째 숫자 입력");
		num4 = sc.nextInt();
		System.out.println("다섯번째 숫자 입력");
		num5 = sc.nextInt();

		if(num1>num2)
		{
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		if(num1>num3)
		{
			temp = num1;
			num1 = num3;
			num3 = temp;
		}
		if(num1>num4)
		{
			temp = num1;
			num1 = num4;
			num4 = temp;
		}
		if(num1>num5)
		{
			temp = num1;
			num1 = num5;
			num5 = temp;
		}	
		if(num2>num3)
		{
			temp = num2;
			num2 = num3;
			num3 = temp;
		}
		if(num2>num4)
		{
			temp = num2;
			num2 = num4;
			num4 = temp;
		}
		if(num2>num5)
		{
			temp = num2;
			num2 = num5;
			num5 = temp;
		} 
		if(num3>num4)
		{
			temp = num3;
			num3 = num4;
			num4 = temp;
		}
		if(num3>num5)
		{
			temp = num3;
			num3 = num5;
			num5 = temp;
		}
		if(num4>num5)
		{
			temp = num4;
			num4 = num5;
			num5 = temp;
		} 
		
		System.out.println(num1 + " " + num2 + " " + num3 + " " + num4 + " " + num5);
	}
}
