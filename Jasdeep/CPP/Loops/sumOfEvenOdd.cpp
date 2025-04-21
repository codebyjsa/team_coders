#include<iostream>
using namespace std;

int main (){

    int n, odd=0, even=0;
    cin>>n;
    for (int i=1; i<=n; i++){
        if (i%2==0)
        {
            even+=i;
        }
        else
        {
            odd+=i;
        }
    }
    cout<<"Even = "<< even<< endl<<"Odd = "<<odd;

    return 0;
}