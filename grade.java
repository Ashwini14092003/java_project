import java.util.*;
class grade
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int marks;
System.out.println("enter the marks:");
marks=sc.nextInt();
if(marks<50)
{
System.out.println("grade u-fail");
}
else if(marks==50)
{
System.out.println("grade e-justpass");
}
else if(marks>50&&marks<=60)
{
System.out.println("grade d-average");
}
else if(marks>60&&marks<=70)
{
System.out.println("grade c-medium");
}
else if(marks>70&&marks<=80)
{
System.out.println("grade b-good");
}
else if(marks>80&&marks<=90)
{
System.out.println("grade a-very good");
}
else if(marks>90&&marks<=100)
{
System.out.println("grade s-excellent");
}
else
{
System.out.println("invalid marks");
}
}
}
