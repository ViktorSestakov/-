#include <iostream>

using namespace std;

int main() {
        setlocale(LC_ALL, "Russian");
        
        int sum = 0;
        int array[5] = {1,1,1,1,1};

        for(int i = 0; i < 5; i++) {
                sum += array[i];
        }
        cout << sum;
}
