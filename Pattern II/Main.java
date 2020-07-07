#include<iostream>
using namespace std;
int main()
{
int a,count=0;
int b=1;
cin>>a;
for(int i=1;i<=a;i++)
{
  int re=b+(i);
  for(int j=1;j<=i;j++)
  {
    if(i%2!=0)
    {
      if(i==1)
        cout<<b;
    else if(i==j)
      cout<<b+1;
    else
      cout<<b+1<<"*";
    b++;
    }
    else
    {
      if(i==j)
      cout<<re;
      else
      cout<<re<<"*";
    re--;
    }
    count++;
    b=count;
  }
  printf("\n");
}
}