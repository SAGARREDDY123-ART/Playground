#include<iostream>
using namespace std;
int main()
{
int a[100],i=0;
  float res=0;
  int count=0;
while(count<3)
{
    cin>>a[i];
    if(a[i]<0)
    { 
      res=res-1;
      break;
    }
    else if(a[i]%2==0)
      res=res-0.5;
    else
    {
      res=res+1;
      count++;
    }
    i++;
  }
  printf("%.1f",res);
}