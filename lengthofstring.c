#include<stdio.h>
#include<conio.h>
void main()
{
	char ch[6];
	int i=0,count=0;
	puts("enter string");
	gets(ch);
	while(ch[i]!='\0')
	{
		count++;
		i++;
	}
	printf("length of string is: %d",count);
	count--;
	i=0;
	while(i<=count)
	{
		if(ch[i]==ch[count])
		{
			i++;
			count--;
			
		}
		else{
			puts("not a palindrome");
			break;
		}
	}
	if(i>count)
	{
		puts("palindrome");
		
	}
	getch();
}
