#include<iostream>
using namespace std;
int main()
{
int num,sum=0,digit;
  cin>>num;
    int temp=num;

  while(num!=0)
  {
    digit=num%10;
    sum=sum+digit;
    num=num/10;
  }
  if(temp%sum==0)
  cout<<"Harshad Number";
  else
    cout<<"Not Harshad Number";
}