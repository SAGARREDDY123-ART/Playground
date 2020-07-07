#include<iostream>
#include<math.h>
using namespace std;
int main()
{
float n,count;
int days,ans;
cin>>n;
count=n*(1/sqrt(n));
days=int(count);
ans=n+days;
cout<<ans+1;
  
}

