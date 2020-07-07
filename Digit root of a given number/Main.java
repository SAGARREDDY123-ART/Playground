//Write a program to find the repeated sum of digits of a number until it becomes a single-digit number.
#include <iostream>
using namespace std;

int main() 
{
  int num,temp,sum=0;
  cin>>num;
  sai:{
    while(num>0)
    {
      temp=num%10;
      sum=sum+temp;
      num=num/10;
    }
  }
  if(sum>9)
  {
    num=sum;
    sum=0;
    goto sai;
  }
  else
    cout<<sum;
    
}