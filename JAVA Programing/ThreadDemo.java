class Current ThreadDemo
{
    public static void main(String[] args)
    {
        Threadt=Thread.currentThread();
        System.out.println("CurrentThread=”+ t);
        t.setNAme(“My Thread”);
        System.out.println(“AfterChanging the name =” +t)
        System.out.println(“NewName   =”+t.getname());
        try
            {
                For(int i=1;i<=5;i++)
                {
                    System.out.println(i);
                    Thread.sleep(1000);     
                }   
             }
        Catch(InterruptedException e)  
        {
            System.out.println(e)    
        }
            System.out.println(“Finished”);  
     }   
}



