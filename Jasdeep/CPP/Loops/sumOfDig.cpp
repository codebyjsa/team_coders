#include<iostream>
using namespace std;

int main (){

    int dig, sum=0, rem;
    cout<<"Enter a number: ";
    cin>>dig;

    while (dig>0)
    {
        rem=dig%10;
        dig/=10;
        sum+=rem;
    }
    cout<<sum;
    

    return 0;
}