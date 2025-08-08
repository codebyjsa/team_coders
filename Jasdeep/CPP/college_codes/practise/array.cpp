#include<iostream>
using namespace std;

int main (){
    int a =0;
    int arr[] = {1, 2, 3, 4, 4, 5, 5, 6, 6, 7, 8}; 
    for(int i = 0; i < sizeof(arr) / sizeof(arr[0]); i++) { 
        //to find average of the array
        
        a += arr[i];
    }
    cout << "Average of the array: " << (double)a / (sizeof(arr) / sizeof(arr[0])) << endl; // Calculate and print the average of the array

}