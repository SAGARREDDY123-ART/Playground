#include<iostream>
using namespace std;
int main()
{
  int a,b,sum=0;
  cin>>a>>b;
  int arr[a];
  for(int i=0;i<a;i++)
  {
    cin>>arr[i];
    sum=sum+arr[i];
  }
  if(sum<=b)
    cout<<"YES";
  else
    cout<<"NO";
  
}