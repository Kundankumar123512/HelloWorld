import java.util.Scanner;

class helloWorld
{
    public static void main(String args[])
    {
        int a;
        int b;
        System.out.println("ENTER NUMBER 1");
        System.out.println("ENTER NUMBER 2");
        Scanner S=new Scanner(System.in);
        a=S.nextInt();
        b=S.nextInt();
        System.out.println(a+b);
}
}