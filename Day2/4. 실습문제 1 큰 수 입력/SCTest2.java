import java.util.Scanner;

class SCTest2
{
	public static void main(String[] args)
	{
		int num1 = 0, num2 = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("ù ��° ���� �Է��ϼ���.");
		num1 = sc.nextInt();
		System.out.println("�� ��° ���� �Է��ϼ���.");
		num2 = sc.nextInt();
		if(num1>num2)
			System.out.println(num1 + "�� " + num2 + "���� Ů�ϴ�.");	
		else if(num1<num2)
			System.out.println(num2 + "�� " + num1 + "���� Ů�ϴ�.");
		else
			System.out.println(num1+ " �� ���� ���� �����ϴ�.");
		sc.close();
	}
}




	