#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int num,digits=0,temp,te;
  cin>>num;
  int tem=num;
  int n=num;
  while(num>0)
  {
    temp=num%10;
    digits++;
    num=num/10;
  }
  int sum=0;
  while(tem>0)
  {
    te=tem%10;
    sum=sum+pow(te,digits);
    tem=tem/10;
  }
  if(n==sum)
    cout<<"Kindly proceed with encrypting";
  else
    cout<<"It is not an Armstrong number";
}
  