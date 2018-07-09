#include<stdio.h>
#include<conio.h>
void main()
{
	char ch[20],*ptr;
	ptr=ch;
	int count=0;
    puts("enter string");
	scanf("%s",&ch);
	
	
	while (*ptr!='\0')
	{
		count++;
		ptr++;
	}
	printf("%d",count);
	getch();
}
