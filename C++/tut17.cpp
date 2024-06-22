//inline functions,default arguments & constant arguments
#include<iostream>
using namespace std;

inline int product(int a, int b){
    //not recommended to use below lines with inline functions
    //static int c=0;//this execute only once
    //c = c+1;//next tinme this function is run,the value of c will be retained
    return a*b;
}

int moneyReceived(int currentMoney, float factor=1.04){
    return currentMoney * factor;
}

//int strlen(const char *p){

//}
int main(){
    int a,b;
    //cout<<"enter the value of a and b ";
    //cin>>a>>b;
    //cout<<"the product of a and b is "<<product(a,b);
    int money = 100000;
    cout<<"if you have "<<money<<"Rs in your bank account, you will recive "<<moneyReceived(money)<<"Rs after 1 year ";
    cout<<"for VIP : if you have "<<money<<"Rs in your bank account, you will recive "<<moneyReceived(money, 1.1)<<"Rs after 1 year ";
    return 0;
}