import java.util.*;
class Reverse
{
public static void main(String args[])
{
int i;
int quo;
int rem;
int a;
int rev=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter number");
a=sc.nextInt();
for(i=1;i<5;i++)
{
rem=a%10;
rev=rev*10+rem;
a=a/10;
}
System.out.println("reverse is"+rev);
}
}