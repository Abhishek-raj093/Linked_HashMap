//Class,public and private access modifiers in c++
#include<iostream>
using namespace std;

class Employee
{
    private :
        int a,b,c;
    public :
        int d,e;
        void setData(int a1, int b1, int c1);//Declaration
        void getData(){
            cout<<"the vlaue of a is "<<a<<endl;
            cout<<"the vlaue of b is "<<b<<endl;
            cout<<"the vlaue of c is "<<c<<endl;
            cout<<"the vlaue of d is "<<d<<endl;
            cout<<"the vlaue of e is "<<e<<endl;
        }
};

void Employee :: setData(int a1, int b1, int c1){
    a = a1;
    b = b1;
    c = c1;
}
int main(){
    Employee harry;
    //harry.a = 134;--->This will throw error as a is private
    harry.d = 34;
    harry.e = 89;
    harry.setData(1,2,4);
    harry.getData();
    return 0;
}