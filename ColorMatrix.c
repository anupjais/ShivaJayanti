#include<stdio.h>
int main()
{
	int i, j;
	for(i=0; i<=10; i++)
	{
		for(j=1; j<=10; j++)
		{
			int k=(i*10+j);
			if((k>10 && k<30) || (k>50 && k<90))
			{
				continue;
			}
//			printf("\033[%dm%d\t\033[0m",k,k);
			printf("\u001b[%dm%d\t\033[0m",k,k);
		}
		printf("\n");
	}
	return 0;
}