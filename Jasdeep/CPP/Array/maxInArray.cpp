#include<iostream>
#include<climits>
using namespace std;

int main () {
    int n;
    cout << "Enter the size of the array: ";
    cin >> n; 

    int arr[n]; 
    for(int i = 0; i < n; i++) {
        cout << "Enter element " << i + 1 << ": ";
        cin >> arr[i]; 
    }

    // int maxElement = arr[0]; 
    int max = INT_MIN; 
    for(int i = 1; i < n; i++) {
        if(arr[i] > max) {
            max = arr[i]; 
        }
    }
    
    cout << "Maximum element in the array: " << max << endl; 

    return 0;
}