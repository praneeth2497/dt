import java.util.*;
class Season
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int month;
System.out.println("enter month");
month=sc.nextInt();
if(month>=2&&month<=5)
{
System.out.println("summer");
}else
if(month>=6&&month<=9)
{
System.out.println("rainy");
}else
if(month>=10&&month<=1)
{
System.out.println("winter");
}
else
{
System.out.println("winter");
}

}
}