#include<iostream>
using namespace std;
int main()
{
  int a;
  cout<<"Enter the number of elements in the array"<<"\n";
  cin>>a;
  int arr[a+1];
  cout<<"Enter the elements in the array"<<"\n";
  for(int i=0;i<a;i++)
  {
    cin>>arr[i];
  }
  arr[a]=0;
 int loc;
  cout<<"Enter the location where you wish to insert an element"<<"\n";
  cin>>loc;
  if(loc<=a&&loc>=1)
  {
    cout<<"Enter the value to insert"<<"\n";
    int val;cin>>val;
    int c=loc-1;

 for(int j=a;j>=c;j--)
   {
     arr[j]=arr[j-1];
   }
            arr[c]=val;

    cout<<"Array after insertion is"<<"\n";
    for(int k=0;k<=a;k++)
   {
     cout<<arr[k]<<"\n";
   }   
  }
  else
    cout<<"Invalid Input";
}