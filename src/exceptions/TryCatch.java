package exceptions;
class TryCatch
{
    public static void main(String args[])
    {
        System.out.println("Hello");
        try{
            System.out.println(10/0);
        }
        catch(ArithmeticException e)
        {
            System.out.println(10/2);
        }
        System.out.println("Hello! How are you?");
    }
}
