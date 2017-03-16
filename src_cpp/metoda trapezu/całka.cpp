#include <iomanip>
#include <iostream>
#include <cstdlib>

using namespace std;

double f(double x)
{
  return(x * x + 2 * x);
}



int main()
{
  const int N = 1000;
  double xp,xk,s,dx;
  int i;

  cout << setprecision(3)      // 3 cyfry po przecinku
       << fixed;               // format sta³oprzecinkowy

  cout << "Podaj poczatek przedzialu calkowania\n\n""xp = ";
  cin >> xp;
  cout << "\nPodaj koniec przedzialu calkowania\n\n""xk = ";
  cin >> xk;
  cout << endl;
  s  = 0;
  dx = (xk - xp) / N;
  for(i = 1; i < N; i++) s += f(xp + i * dx);
  s = (s + (f(xp) + f(xk)) / 2) * dx;
  cout << "Wartosc calki wynosi : " << setw(8) << s
       << endl << endl;

  return 0;
}
