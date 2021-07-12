class Swap
{
	public static void main(String[] args)
	{
		int num1= 10, num2=5; 
		int temp=0;		

		System.out.println(num1+" "+num2);		
		temp=num1;
		num1=num2;
		num2=temp;				
		System.out.println(num1+" "+num2);		
	}
}