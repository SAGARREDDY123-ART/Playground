#include<iostream>
using namespace std;
int main()
{
  int mon;
  cin>>mon;
  int a=20;
  int month[a];// 0 to 49
  month[0]=0;
  month[1]=1;
  for(int i=2;i<=a-1;i++)
  {
    month[i]=month[i-1]+month[i-2];
  }
  
  cout<<month[mon-1];
}