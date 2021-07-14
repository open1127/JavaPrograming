import java.util.*;

class RandomTest2
{
	public static void main(String[] args)
	{
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		int rnum = 0, inum=0, cnt=0;

		rnum = rand.nextInt(100)+1;	
		System.out.println("게임을 시작합니다.");
		System.out.println("숫자를 입력하세요.");	
		while(rnum!=inum)
		{
			cnt++;
			inum = sc.nextInt();
			if(rnum > inum)
				System.out.println("당신이 입력한 숫자 보다 큽니다.");
			else if(rnum < inum)
				System.out.println("당신이 입력한 숫자 보다 작습니다.");
			else
				System.out.println("정답입니다. 당신은 " + cnt + "번만에 정답을 입력하셨습니다.");

		}
		System.out.println("프로그램을 종료합니다.");
	}
}