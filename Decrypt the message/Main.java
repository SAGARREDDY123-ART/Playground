#include<iostream>
using namespace std;
int main()
{
  int a,b,res=0;
  cin>>a>>b;
  int sum=a+b;
  int temp=sum;
  for(int i=1;i<sum;i++)
  {
    if(sum%i==0)
      res=res+i;
  }
  if(temp==res)
    cout<<"They can read the message";
  else
    cout<<"They can't read the message";


}