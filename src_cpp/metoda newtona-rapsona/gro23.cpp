#include <iostream>
#include <math.h>

using namespace std;

int main() {
    float A,a;
    float eps = 0.0001;

    cin >> A;
    a = A/2;

    while(fabs(A/a-a)>eps)
    {
        a = (A/a+a)/2;
    }

    cout << a;
    return 0;
}
