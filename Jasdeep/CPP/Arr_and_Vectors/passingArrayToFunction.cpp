#include<iostream>
using namespace std;

void display(int arr[]){
    for (int i = 0; i < 5; i++)
    {
        cout<<arr[i]<<endl;
    }
    
}

int main(){

    int arr[] = {1,4,2,7,4};
    //accessing the elements of array in another function
    //updation, pass by value/reference?

    display(arr);

    return 0;
}