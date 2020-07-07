//Write a program to compute the factorial of a number using recursion. 
#include<iostream>
using namespace std;
int fact(int num);
int main()
{
  int n;
  cin>>n;
  cout<<"The factorial of "<<n<<" is "<<fact(n);
}
int fact(int num)
{
  if(num==0||num==1)
    return 1;
  else
    return num*fact(num-1);
}