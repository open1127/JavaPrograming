class ConstantTest ���
{
	public static void main(String[] args)
	{
		final int MAX = 5;		// ������ ��� �ʱ�ȭ�� �� �ѹ��� �̷������.
		/*
		final int MAX;
		MAX = 5;
		*/
		int i=0;

		for(i=0;i<MAX;i++)		//MAX�� ����� ��ȣȭ��
		{
			System.out.println("Hello");
		}
	}
}
>>symbolic constant �ɺ��� ���
����� ��ȣȭ�Ͽ� �̸��� ������ �ִ� ���
final Ű����� ����
�ɺ��� ����� �����̸� ��ü�� �빮�ڷ� ����. 
�ҹ��ڵ� ������ �ƴ����� �����ڵ��� �Ϲ����� ��� -->������
