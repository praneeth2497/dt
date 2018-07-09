import java.util.*;
class vowel
{
public static void main(String args[])
{
String s;
System.out.println("enter alphabet");
Scanner sc=new Scanner(System.in);
s=sc.nextLine();
char ch=s.charAt(0);
switch(ch)
{
case 'a':
System.out.println("vowel");
break;
case 'e':
System.out.println("vowel");
break;
case 'i':
System.out.println("vowel");
break;
case 'o':
System.out.println("vowel");
break;
case 'u':
System.out.println("vowel");
break;
default:
System.out.println("consonant");
break;
}
}
}