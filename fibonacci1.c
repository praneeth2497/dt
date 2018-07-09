#include<stdio.h>
#include<conio.h>
void main()
{
	int v1,v2,v3,i,a;
		puts("enter num");
	scanf("%d",&a);
	v1=0;
	v2=1;
	printf("%d%d",v1,v2);

	for(i=2;i<a;i++)
	{
		v3=v1+v2;
		printf("%d",v3);
		v1=v2;
		v2=v3;


}
}

