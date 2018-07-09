import java.util.*;
class SingleLetter
{
public static void main(String args[])
{
String s;
int a;
Scanner sc=new Scanner(System.in);

System.out.println("enter alphabet");
s=sc.nextLine();
char ch=s.charAt(0);
a=(int)ch;
a=a-32;
System.out.println((char)a);
}
}