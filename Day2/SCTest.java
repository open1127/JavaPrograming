import java.util.Scanner;

class SCTest
{
	public static void main(String[] args)
	{
		int num1=0,num2=0; 	
		Scanner sc = new Scanner(System.in);
		System.out.println("ù��° ���ڸ� �Է��ϼ���.");
		num1=sc.nextInt(); 
		System.out.println("�ι�° ���ڸ� �Է��ϼ���.");
		num2=sc.nextInt(); 
		System.out.println("����� �Է��� �� ���� " +num1+"��"+ num2);
		sc.close();
	}
}
