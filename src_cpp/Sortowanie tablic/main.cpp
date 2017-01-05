#include <iostream>

using namespace std;

int main()
{
    int tab[] = {3, 6, 1, 73, 32, 67, 39, 2, 5};
    int min = tab[0];
    int max = tab[0];

    for(int i = 0; i<9; i++){
        if(tab[i]<min) min = tab[i];
        if(tab[i]>max) max = tab[i];
    }

    cout << "Min: " << min << ", max: " << max << endl;
    return 0;
}
