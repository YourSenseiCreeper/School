#include <iostream>
#include <fstream>

using namespace std;

int main()
{
    fstream plik;
    plik.open("abc.txt",ios::out);

        plik << "tekst do pliku";
        plik.close();

    return 0;
}
