#include<iostream>
using namespace std;
int main()
{
 int r,c,t;//row columan tree number
  cin>>r>>c>>t;
  if((t<=(2*r)&&t>(r+1))||((t<=(c-1)*r)&&(t>(c-2)*r)))
  {
    cout<<"It is a mango tree";
  }
  else
    cout<<"It is not a mango tree";
  
}