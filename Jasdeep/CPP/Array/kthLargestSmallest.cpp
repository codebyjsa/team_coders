#include<iostream>
using namespace std;

void selectionSort(int arr[], int n) {
    for (int i = 0; i < n - 1; i++) {
        int minIndex = i;
        for (int j = i + 1; j < n; j++) {
            if (arr[j] < arr[minIndex]) {
                minIndex = j;
            }
        }
        swap(arr[i], arr[minIndex]);
    }
}

void printKthLargestSmallest(int arr[], int n, int k) {
    selectionSort(arr, n);
    
    if (k > 0 && k <= n) {
        cout << "The " << k << "th smallest element is: " << arr[k - 1] << endl;
        cout << "The " << k << "th largest element is: " << arr[n - k] << endl;
    } else {
        cout << "Invalid value of k." << endl;
    }
}

int main() {
    int arr[] = {12, 3, 5, 7, 19, 8};
    int n = sizeof(arr) / sizeof(arr[0]);
    int k = 3;

    printKthLargestSmallest(arr, n, k);

    return 0;
}