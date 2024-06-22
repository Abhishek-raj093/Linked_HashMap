//about pointer in c++ (video no 12)
#include<iostream>
using namespace std;

int main(){;
    //what is pointer? ----> it is a data type which holds the address of other data type

    int a=3;
    int* b;
    b = &a;
    // & ---> (Address of) opereter
    cout<<"the address of a is "<<&a<<endl;
    cout<<"the address of a is "<<b<<endl;

    // * ---> (value at) Dereference operator
    cout<<"the value at address b is "<<*b<<endl;//we use * in value at operator

    //pointer to pointer
    int** c = &b;
    cout<<"The address of b is "<<&b<<endl;
    cout<<"The address of b is "<<c<<endl;
    cout<<"The value at address of c is "<<*c<<endl;
    cout<<"The value at address_at(value_at(c)) is "<<**c<<endl;
    
    return 0;
}