//constants,manipulators & operator precedence
#include<iostream>
#include<iomanip>

using namespace std;

int main()
{
   // int a = 36;
    //char c = 'c';
    //cout<<"the value of a was :"<<a;
    //cout<<"the value of a was :"<<c;
    //int a = 45;
    //c = '4';
    //cout<<"the value of a is :"<<a;//due to this we get the changed value of a in c++
    //cout<<"the value of a is :"<<c;//due to this we get the changed value of c in c++

    //constants in c++(the value of constants can not be changed)
    //const int a = 3;//at the place of int we can also use float,dauble,long dauble but the result is always same it does't change the value from 3 to 45
    //cout<<"the value of a was :"<<a;
    //a = 45;//you will get an error because a is a constant and hare that is 3
    //cout<<"the value of a is :"<<a;

    //manipulators in c++
    //int a = 3, b = 78, c = 1233;
    //cout<<"the value of a is:"<<setw(4)<<a<<endl;//setw is coming from iomanip in every line(it gives the space of 4 width in result)
    //cout<<"the value of b is:"<<setw(4)<<b<<endl;//endl is also a manipulator
    //cout<<"the value of c is:"<<setw(4)<<c<<endl;

    //cout<<"the value of a is:"<<a<<endl;
    //cout<<"the value of b is:"<<b<<endl;
    //cout<<"the value of c is:"<<c<<endl;

    //operator Precedence
    int a = 3, b = 4;
    //int c = (a*5)+b;
    int c = ((((a*5)+b)-45)+87);
    cout<<c;
    return 0;
}