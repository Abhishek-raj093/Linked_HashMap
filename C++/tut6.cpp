//There are two types of header files:
//1.System hader file : It comes with compiler 
#include<iostream>
//2.User defined hader files : It written by the programmer
//#include"this.h" //----> this will produce error if this.h is not present in current directory

using namespace std;
int main()
{
    int a=4,b=5;
    cout<<"\n operators in c++";
    cout<<"\n following are the types of operators in c++";
    //Arthmatic operators
    cout<<"the value of a + b is"<<a+b<<endl;
    cout<<"the value of a - b is"<<a-b<<endl;
    cout<<"the value of a * b is"<<a*b<<endl;
    cout<<"the value of a / b is"<<a/b<<endl;
    cout<<"the value of a % b is"<<a%b<<endl;//%---->thisis moldulo operator
    cout<<"the value of a ++ is"<<a++<<endl;//in this first print then increment
    cout<<"the value of ++a is"<<++a<<endl;//in this first increment then print

    //Assigment Operators -->used to assign values to variables
    //int a=3,b=4;
    //char d='d';

    //comparison operarors
    cout<<"following are the comparison operator in c++"<<endl;
    cout<<"the value of a == b is "<<(a==b)<<endl;
    cout<<"the value of a != b is "<<(a!=b)<<endl;//!= it means not equal to
    cout<<"the value of a >= b is "<<(a>=b)<<endl;
    cout<<"the value of a <= b is "<<(a<=b)<<endl;
    cout<<"the value of a > b is "<<(a>b)<<endl;
    cout<<"the value of a < b is "<<(a==b)<<endl;
    cout<<endl;

     //logical operarors
    cout<<"following are the logical operator in c++"<<endl;
    cout<<"the value of this logical and operator ((a==b) && (a<b)) is "<<((a==b) && (a<b))<<endl;//for and opreator both condition will be true
    cout<<"the value of this logical or operator ((a==b) || (a<b))  is "<<((a==b) || (a<b))<<endl;//for or operator if any one condition is true then it will print true (1)
    cout<<"the value of this logical not operator (!(a==b) || (a<b))  is "<<(!(a==b))<<endl;//! not operator will reverse the result 

    return 0;
}