#include<iostream>
using namespace std;
int main()
{
int age;
  int showtime;
  cin>>age>>showtime;
 if(age>13)
 {
   if(showtime==13)
     cout<<"$5.00";
   else
     cout<<"$8.00";
 }
  else
  {
    if(showtime==13)
      cout<<"$2.00";
    else
      cout<<"$4.00";

   }
}