//decending order
import java.util.*;
class decending
{
public static void main(String args[])
{
int i;
int j;
int arr[]=new int[5];
int temp=0;
for(i=0;i<5;i++)
{
System.out.println("enter num");
Scanner sc=new Scanner(System.in);
arr[i]=sc.nextInt();
}
for(i=0;i<5;i++)
{
for(j=i+1;j<5;j++)
{
if(arr[i]<arr[j])
{
temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
}
}
System.out.println("decending order is"+arr[i]);
}
}
}