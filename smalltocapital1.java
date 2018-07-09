import java.util.*;
class smalltocapital1
{
public static void main(String args[])
{
String str;
int b;
int i;
char a[]=new char[20];
System.out.println("enter string");
Scanner sc=new Scanner(System.in);
str=sc.nextLine();
for(i=0;i<10;i++)
{
a[i]=str.charAt(i);
b=(int)a[i];
if(a[i]=='\0')
{
break;
}
b=b-32;
System.out.print((char)b);
}
}
}