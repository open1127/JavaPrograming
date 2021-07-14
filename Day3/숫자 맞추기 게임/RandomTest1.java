import java.util.*;

class RandomTest1
{
	public static void main(String[] args)
	{
		int rnum = 0, inum=0, cnt=0; 
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);

		System.out.println("게임을 시작합니다.");
		System.out.println("숫자를 입력하세요.");
		rnum = rand.nextInt(100)+1;	
	
		while(true)
		{
			cnt++;
			inum = sc.nextInt();
			if(rnum > inum)
				System.out.println("당신이 입력한 숫자 보다 큽니다.");
			else if(rnum < inum)
				System.out.println("당신이 입력한 숫자 보다 작습니다.");
			else
			{
				System.out.println("정답입니다. 당신은 " + cnt + "번만에 정답을 입력하셨습니다.");
				break;
			}
		}
		System.out.println("프로그램을 종료합니다.");
	}
}