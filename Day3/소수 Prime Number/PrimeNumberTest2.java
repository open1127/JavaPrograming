import java.util.Scanner;

class PrimeNumberTest2
{
	public static void main(String[] args)
	{
		int num=0, i=0;
		boolean flag=true;
		Scanner sc = new Scanner(System.in);

		System.out.println("�Ҽ� �Ǻ� ���α׷�");
		System.out.println("�Ǻ��ϱ⸦ ���ϴ� ���ڸ� �Է��ϼ���.");
		num = sc.nextInt();

		if(num<=1) System.out.println(num + "�Ҽ��� �ƴմϴ�.");
		else
		{
			for(i=2;i<num;i++)
			{
				if(num%i==0)
				{
					flag = false;			
					break;
				}
			}
			if(flag) System.out.println(num + " �Ҽ��Դϴ�.");
			else System.out.println(num + " �Ҽ��� �ƴմϴ�.");
		}
	}
}













