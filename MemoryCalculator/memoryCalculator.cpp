#include<bits/stdc++.h>

int additionRepeater(int s,int a,int k)
{
	for(int i=0;i<k;i++)
	{
		a+=s;
	}
	return a;
}

int main()
{
	char datatype[20];
	int a=0,t=0;
	scanf("%d",&t);
	for(int i=0;i<t;i++)
	{
		scanf("%s",datatype);
		int k=0;
		if(strcmp(datatype,"int")==0)
		{
			scanf("%d",&k);
			a=additionRepeater(4,a,k);
		}
		else if(strcmp(datatype,"double")==0)
		{
			scanf("%d",&k);
			a=additionRepeater(8,a,k);
		}
		else if(strcmp(datatype,"char")==0)
		{
			scanf("%d",&k);
			a=additionRepeater(1,a,k);
		}
		else if(strcmp(datatype,"long")==0)
		{
			scanf("%d",&k);
			a=additionRepeater(8,a,k);
		}
		else if(strcmp(datatype,"float")==0)
		{
			scanf("%d",&k);
			a=additionRepeater(4,a,k);
		}
		else if(strcmp(datatype,"short")==0)
		{
			scanf("%d",&k);
			a=additionRepeater(2,a,k);
		}
	}
	printf("%d",a);
}