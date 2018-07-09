//read character and print it twice
import java.util.*;
class readchar
{
public static void main(String args[])
{
String c;
Scanner s=new Scanner(System.in);
c=s.nextLine();
char ch=c.charAt(0);
System.out.println("single char="+ch);
System.out.println("single char="+ch);
}
}