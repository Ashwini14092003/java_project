import java.util.*;
class loan
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int age;
		System.out.println("enter your age:");
		age=sc.nextInt();
		if(age>=23)
		{
			System.out.println("the person is eligible to avail loan");
		}
	}
}
