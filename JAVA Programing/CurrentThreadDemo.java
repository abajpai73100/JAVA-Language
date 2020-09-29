class CurrentThreadDemo
{
    public static void main(String[] args)
    {
        Threadt=ThreadcurrentThread();
        System.out.println("CurrentThread=” +t);
        t.setName(“My Thread”);
        System.out.println(“AfterChanging the name =” +t)
        System.out.println(“NewName   =” + t.getname());
        try
            {
                for(int i=1;i<=5;i++)
                {
                    System.out.println(i);
                    Thread.sleep(1000);     
                }   
             }
        Catch(InterruptedException e)
        {
            System.out.println(e);    
        }
            System.out.println(“Finished”);  
     }   
}



