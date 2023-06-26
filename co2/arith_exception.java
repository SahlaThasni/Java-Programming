import java.util.Scanner;
class Except
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a:");
int a=sc.nextInt();
System.out.println("Enter b:");
int b=sc.nextInt();
try
{
int c=a/(a-b);
System.out.println("output=" +c);
}
catch(ArithmeticException e)
{
System.out.println("Arithmetic exception:...." +e);
}
finally
{
System.out.println("Finally break");
System.out.println("a=" +a);
System.out.println("b=" +b);
System.out.println("END");
}
}}
