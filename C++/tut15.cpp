//function and function prototypes in c++
#include<iostream>
using namespace std;

//int sum(int a, int b){
    //int c =a+b;
    //return c;
//}
//function prototype
/*syntex
type function-name (arguments)*/
int sum(int a, int b);//--->Acceptable in function prototype
//a and b are formal parameters 
//int sum(int a, b);--->Not Acceptable in function prototype 
//int sum(int , int)--->Acceptable in function prototype 
//void g(void);--->Acceptable
void g();

int main(){
    int num1, num2;
    cout<<"enter first number"<<endl;
    cin>>num1;
    cout<<"enter the second number"<<endl;
    cin>>num2;
    //num1 and num2 are actual parameters
    cout<<"the sum is "<<sum(num1,num2);
    g();
    return 0;
}

int sum(int a, int b){
    //formal parameters a and b will be taking values from actual parameters num1 and num2
    int c = a+b;
    return c;
}

void g(){
    cout<<"\nhello,Good morning";
}