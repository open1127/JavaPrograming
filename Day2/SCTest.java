import java.util.Scanner;

class SCTest
{
	public static void main(String[] args)
	{
		int num1=0,num2=0; 	
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력하세요.");
		num1=sc.nextInt(); 
		System.out.println("두번째 숫자를 입력하세요.");
		num2=sc.nextInt(); 
		System.out.println("당신이 입력한 두 수는 " +num1+"과"+ num2);
		sc.close();
	}
}
