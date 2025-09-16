#include<iostream>
using namespace std;

// Function to input array elements
void inputArray(int arr[], int n) {
    for(int i = 0; i < n; i++) {
        cout << "Enter element " << i + 1 << ": ";
        cin >> arr[i];
    }
}

// Function to calculate sum of array elements
int calculateSum(int arr[], int n) {
    int sum = 0;
    for(int i = 0; i < n; i++) {
        sum += arr[i];
    }
    return sum;
}

// Function to search for an element in the array
bool linearSearch(int arr[], int n, int x) {
    for(int i = 0; i < n; i++) {
        if(arr[i] == x) {
            return true;
        }
    }
    return false;
}

// Function to print search result
void printSearchResult(bool isFound) {
    if (isFound) {
        cout << "Element found in the array." << endl;
    } else {
        cout << "Element not found in the array." << endl;
    }
}

int main() {
    int n;
    cout << "Enter the size of the array: ";
    cin >> n;

    int arr[n];
    
    // Input array elements
    inputArray(arr, n);
    
    // Calculate and display sum
    int sum = calculateSum(arr, n);
    cout << "Sum of the array elements: " << sum << endl;

    // Search for an element
    int x;
    cout << "Enter the element to search: ";
    cin >> x;
    
    bool isFound = linearSearch(arr, n, x);
    printSearchResult(isFound);

    return 0;
}