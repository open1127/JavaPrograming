import java.util.Scanner;

class SCTest2
{
	public static void main(String[] args)
	{
		int num1 = 0, num2 = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("첫 번째 수를 입력하세요.");
		num1 = sc.nextInt();
		System.out.println("두 번째 수를 입력하세요.");
		num2 = sc.nextInt();
		if(num1>num2)
			System.out.println(num1 + "이 " + num2 + "보다 큽니다.");	
		else if(num1<num2)
			System.out.println(num2 + "이 " + num1 + "보다 큽니다.");
		else
			System.out.println(num1+ " 두 수가 서로 같습니다.");
		sc.close();
	}
}




	