package collection;
import java.util.HashSet;
import java.util.Scanner;
public class HashDemo1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        HashSet<Integer> hs=new HashSet<>();
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(2);
        int a=sc.nextInt();
//For search contains
        if(hs.contains(a))
            System.out.println("Set contains "+ a);
        else
            System.out.println("Set does not contains"+ a);
//Delete
        hs.remove(2);
        if(!hs.contains(2)){
            System.out.println("2 Deleted");
        }
    }
}