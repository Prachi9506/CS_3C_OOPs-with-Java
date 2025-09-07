package exceptions;

class ExcThrows
{
    public static void main(String args[]) throws InterruptedException
    {
        taskOne();
    }
    public static void taskOne() throws InterruptedException
    {
        taskTwo();
    }
    public static void taskTwo() throws InterruptedException
    {
        Thread.sleep(1000);
    }
}

