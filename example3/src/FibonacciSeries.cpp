
#include <iostream>
using namespace std;

void printFibonacciSeries(int n) {
    int n1 = 0, n2 = 1, n3;
    cout << n1 << " " << n2 << " ";
    
    for(int i = 2; i < n; ++i) {
        n3 = n1 + n2;
        cout << n3 << " ";
        n1 = n2;
        n2 = n3;
    }
    cout << endl;
}

int main() {
    int count = 10;
    cout << "Fibonacci Series of " << count << " numbers: ";
    printFibonacciSeries(count);
    return 0;
}
