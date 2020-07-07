#include <iostream>
using namespace std;
int main() 
{
  int num,temp,rev=0;
  cin>>num;
  while(num!=0)
  {
    temp=num%10;
    rev=rev*10+temp;
    num=num/10;
    
  }
cout<<rev;
	return 0;
}