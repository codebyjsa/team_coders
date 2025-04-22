#include<iostream>
using namespace std;

int main (){

    int a=100;

    while (a>0)
    {
        a-=3;
        if (a<0)
        {
            break;
        }
        else{
        cout<<a<<endl;
        }
    }
    

    return 0;
}