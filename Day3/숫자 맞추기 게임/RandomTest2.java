import java.util.*;

class RandomTest2
{
	public static void main(String[] args)
	{
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		int rnum = 0, inum=0, cnt=0;

		rnum = rand.nextInt(100)+1;	
		System.out.println("������ �����մϴ�.");
		System.out.println("���ڸ� �Է��ϼ���.");	
		while(rnum!=inum)
		{
			cnt++;
			inum = sc.nextInt();
			if(rnum > inum)
				System.out.println("����� �Է��� ���� ���� Ů�ϴ�.");
			else if(rnum < inum)
				System.out.println("����� �Է��� ���� ���� �۽��ϴ�.");
			else
				System.out.println("�����Դϴ�. ����� " + cnt + "������ ������ �Է��ϼ̽��ϴ�.");

		}
		System.out.println("���α׷��� �����մϴ�.");
	}
}