import java.util.*;
class Sal
{
int Bsalary;
int incentives;
int allowance;

	Sal()
            {
	      Bsalary=0;
	      incentives=0;
              allowance=0;	
		}
	Sal(int a)
{
Bsalary=a;
}
	Sal(int a,int b){
Bsalary=a;
incentives=b; 
}
	Sal(int a,int b,int c)
{
Bsalary=a;
incentives=b;
allowance=c;
}

void calSal()
{
int C= Bsalary+incentives+allowance;
System.out.println("Total Salary");
System.out.println(C);
}
}

public class salary{

	public static void main()
{
Sal S=new Sal();
Sal D=new Sal(24500);
Sal G=new Sal(24500,4000);
Sal F=new Sal(24500,4000,500);
F.calSal();
}
}
