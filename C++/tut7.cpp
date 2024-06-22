//reference variable and typecasing
#include<iostream>

using namespace std;
int c = 45;//this is global variable
int main()
{
    //*************Build in Data type**************
   // int a,b,c;//this is local variable
    //cout<<"enter the value of a :"<<endl;
    //cin>>a;  
    //cout<<"enter the value of b :"<<endl;
    //cin>>b;

    //c=a+b;
    //cout<<"the sum is "<<c;
    //cout<<"the global c is "<<::c;//:: is scope resolution operator(which is use to print global variable value)

    //************float, dauble and long dauble literals**************
    //float d=34.4f;
    //long double e = 34.4l;
    //cout<<"the value of 34.4 is "<<sizeof(34.4)<<endl;
    //cout<<"the value of 34.4f is "<<sizeof(34.4f)<<endl;
    //cout<<"the value of 34.4F is "<<sizeof(34.4F)<<endl;
    //cout<<"the value of 34.4l is "<<sizeof(34.4l)<<endl;
    //cout<<"the value of 34.4L is "<<sizeof(34.4L)<<endl;
    //cout<<"the value of d is :"<<d<<endl<<"the value of e is :"<<e<<endl;

    //************Referance Variables**************
    //shubham karna -----> subh -----> mota -----> geek(Dangerous Coder)
    //float x =455;
    //float &y =x;
    //cout<<x<<endl;
    //cout<<y<<endl;

    //************TypeCasting**************
    int a = 45;
    float b = 45.46;
    cout<<"\n the value of a is "<<(float)a<<endl;//the meanning of (float)a and float(a) is same
    cout<<"\n the value of a is "<<float(a)<<endl;

    cout<<"\n the value of b is "<<(int)b<<endl;
    cout<<"\n the value of b is "<<int(b)<<endl;
    int c = int(b);//by using this we can get the value of b in c

    cout<<"\n the expresion is "<<a+b<<endl;
    cout<<"\n the expresion is "<<a+int(b)<<endl;
    cout<<"\n the expresion is "<<a+(int)b<<endl;
    return 0; 
}