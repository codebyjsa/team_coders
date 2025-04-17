#include<iostream>
using namespace std;

int main (){

    int decNum = 50;
    int pow = 1;
    int bin_num = 0;

    while (decNum>0)
    {
        int rem = decNum%2;
        decNum = decNum/2;
        bin_num += (rem*pow);
        pow = pow * 10;
    }

    cout<<bin_num<<endl;    

    return 0;
}