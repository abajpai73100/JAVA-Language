import java.util.Scanner;
class electric
{
    public static void main(String[] args)
    {
        elec e=new elec();
        e.input();
        e.compute();
    }
}
class elec
{
    int unit;
    int val;
    Scanner sc=new Scanner(System.in);
    void input()
    {
        System.out.println("enter unit");
        unit=sc.nextInt();
    }
    void compute()
    {
        if(unit<=100)
        {
            val=5*unit;
        }
        else
        if(unit>100&&unit<=200)
        {
            val=((5*100)+((unit-100)*6));
        }
        else
        if(unit>200&&unit<=300)
        {
            val=((5*100)+(6*100)+((unit-200)*8));
        }
        else
        {
            val=((5*100)+(6*100)+(8*100)+((unit-300)*10));
        }
        System.out.println(val);
    }
}
