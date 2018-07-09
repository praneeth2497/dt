//read num of elements from user and and enter element values and search a value and print value is present at which position or else no num
import java.util.*;
class Search
{
public static void main(String args[])
{
int i;
int j;
int h;
int val[]=new int[7];
System.out.println("enter no of numbers");
Scanner sc=new Scanner(System.in);
j=sc.nextInt();
for(i=0;i<j;i++)
{
System.out.println("enter numbers");
val[i]=sc.nextInt();
}
System.out.println("enter searching number");
h=sc.nextInt();
for(i=0;i<j;i++)
{
if(h==val[i])
{
System.out.println(+h+"is at"+(i+1)+"position");
break;
}}
if(h!=val[i])
{
System.out.println("not a num");
}


	
/*if(h==val[0])
{
System.out.println(+h+"is at 1st position");
}else
if(h==val[1])
{
System.out.println(+h+"is at 2nd position");
}else
if(h==val[2])
{
System.out.println(+h+"is at 3rd position");
}else
if(h==val[3])
{
System.out.println(+h+"is at 4th position");
}else
if(h==val[4])
{
System.out.println(+h+"is at 5th position");
}else
if(h==val[5])
{
System.out.println(+h+"is at 6th position");
}else
if(h==val[6])
{
System.out.println(+h+"is at 2nd position");
}
else
{
System.out.println("number not present");
}*/
}
}
