#include <iostream>
#include <cmath>

using namespace std;

double f (double x)
{

return (x*x+2*x);

}

int main()
{

    double xp, xq, n;
    double x;

    double dx;
    double pole;
    double s=0;
    dx=(xq-xp)/n;

    cout<<"Podaj x poczatkowe ";

    cin>>xp;
    cout<<"Podaj x koncowe ";
    cin>>xq;
    cout<<"Na ile fragmentow podzielic obszar? ";
    cin>>n;
    cout<<endl;

    for (int i=1;i<n;i++)
{
    s+=abs(f(xp+i*dx));
}
    pole = dx/2*(abs(f(xp))+abs(f(xq))+2*s);
    cout<<"Pole obszaru to "<<pole;



    return 0;
}
