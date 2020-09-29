import java.util.*;
class One
{
    synchronized void display(int num)
    {
        try
        {
            for(int i=1;i<=10;i++)
                {
                    System.out.println(num+”X”+i+”=”+num*i);
                    Thread.sleep(1000);
                }
        }
                Catch(Interrupte Exception e)
           {
           }
        System.out.println(“done”);
    }
}
class Two implementRunnable
{
    int number;
    One one;
    Thread t;
    Two (One one_num,int n)
    {
        One=one_num;
        Number=n;
        t=new Thread(this);
        t.start();
    }
    PublicVoid run()
        {

            One.display(number);
        }
}
Class syncronization
{
    Public Static void main(String[] args)
    {
        One one=newOne();
        Two s1=newTwo(one,5);
        Two s2=newTwo(one,8);
        Two s3=newTwo(one,7);
    }
}
