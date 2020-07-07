#include<iostream>
using namespace std;
int main()
{
int r,even=0,odd=0;
cout<<"Enter the number of elements in the array"<<"\n";
cin>>r;
int arr[r];
cout<<"Enter the elements in the array"<<"\n";
  for(int i=0;i<r;i++)
{
    cin>>arr[i];
    if(arr[i]%2==0)
      even++;
    else
      odd++;
}
  if(even==0)
    cout<<"The array is Odd";
  else if(odd==0)
    cout<<"The array is Even";
  else
    cout<<"The array is Mixed";
}