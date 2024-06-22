//call by value and cale by reference
#include<iostream>
using namespace std;

int sum(int a, int b){
    int c = a + b;    
    return c;      
}

//this will not swap a and b
int swap(int a, int b){//temp a  b
    int temp = a;      //4    4  5
    a = b;             //4    5  5
    b = temp;          //4    5  4
}

//call by referance using pointers
int swapPointer(int* a, int* b){//temp a  b
    int temp = *a;      //4    4  5
    *a = *b;             //4    5  5
    *b = temp;          //4    5  4
}

//call by referance using c++ reference variables
//int &
int swapReferenceVar(int &a, int &b){//temp a  b
    int temp = a;      //4    4  5
    a = b;             //4    5  5
    b = temp;          //4    5  4
    return a;//this is return by reference in this function will return you the reference. return you the updeted value of a
}
int main(){
    int a=4, b=5;
    //cout<<"the sum of 4 and 5 is "<<sum(a,b);
    cout<<"the value of a is "<<a<<"and the value of b is "<<b<<endl;
    //swap(a ,b);//this will not swap a and b
    //swapPointer(&a,&b);//this will swap a and b using pointer reference
    //swapReferenceVar(a, b) = 766;
    swapReferenceVar(a, b);//this will swap a and b using reference Variables in this we are capable to change the actual arguments
    cout<<"the value of a is "<<a<<"and the value of b is "<<b<<endl;    
    return 0;
}
//766 is for return by reference ,& is also for this