import java.util.*;

class RandomTest1
{
	public static void main(String[] args)
	{
		int rnum = 0, inum=0, cnt=0; 
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);

		System.out.println("������ �����մϴ�.");
		System.out.println("���ڸ� �Է��ϼ���.");
		rnum = rand.nextInt(100)+1;	
	
		while(true)
		{
			cnt++;
			inum = sc.nextInt();
			if(rnum > inum)
				System.out.println("����� �Է��� ���� ���� Ů�ϴ�.");
			else if(rnum < inum)
				System.out.println("����� �Է��� ���� ���� �۽��ϴ�.");
			else
			{
				System.out.println("�����Դϴ�. ����� " + cnt + "������ ������ �Է��ϼ̽��ϴ�.");
				break;
			}
		}
		System.out.println("���α׷��� �����մϴ�.");
	}
}