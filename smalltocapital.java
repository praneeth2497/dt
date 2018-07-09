import java.util.*;
class smalltocapital
{
public static void main(String args[])
{
String s;
int i;
char a[]=new char[10];
System.out.println("enter alphabet");
Scanner sc=new Scanner(System.in);
s=sc.nextLine();
a=s.toCharArray();
for(i=0;i<s.length();i++)
{
char c=a[i];
int b=c;
b=b-32;
char ch=(char)b;
System.out.print(ch);
}
}
}