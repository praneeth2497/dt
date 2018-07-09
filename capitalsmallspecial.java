import java.util.*;
class capitalsmallspecial
{
public static void main(String args[])
{
String s;
System.out.println("enter alphabet");
Scanner sc=new Scanner(System.in);
s=sc.nextLine();
char ch=s.charAt(0);
if(ch>='a'&&ch<='z')
{
System.out.println("small");
}else
if(ch>='A'&&ch<='Z')
{
System.out.println("capital");
}else
if(ch>='0'&&ch<='9')
{
System.out.println("number");
}
else 
{
System.out.println("specialcharacter");
}
}
}