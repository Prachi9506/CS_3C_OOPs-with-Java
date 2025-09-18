package exceptions;

class ExcepOrder
{
    public static void main(String args[])
    {
        try {
            System.out.println(1/0);
        } catch(Exception e) {
            System.out.println("Exception");
        }
        catch(ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        }

    }
}