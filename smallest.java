//read num from user and print smallest num
import java.util.*;
class smallest
{
public static void main(String args[])
{
int i,temp;
int arr[]=new int[5];
for(i=0;i<5;i++)
{
System.out.println("eneter num");
Scanner sc=new Scanner(System.in);
arr[i]=sc.nextInt();
}
temp=arr[0];
for(i=0;i<5;i++)
{

if(temp>arr[i])
{
temp=arr[i];
}
}
System.out.println("smallest is"+temp);
}
}
