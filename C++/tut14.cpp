//Strecture,unions&enums in c++
#include<iostream>
using namespace std;

//struct employee//if we use typeder before strecture
//{
    /* data */
    //int eId;
    //char favChar;
    //float salary;
//};//if typeder is used then write 'ep' hare it is a shortcut

//int main(){
    //struct employee abhishek;//we can write 'ep' on the place of struct becaue it make easy things for us
    //abhishek.eId=1;
    //abhishek.favChar='c';
    //abhishek.salary=120000000;
    //cout<<"the value is "<<abhishek.salary<<endl;
    //cout<<"the vlue is "<<abhishek.favChar<<endl;
    //cout<<"the value is "<<abhishek.eId<<endl;

    //union money
    //{
        //int rice;
        //char car;
        //float pounds;
    //};

    //int main(){
        //union money m1;
        //m1.rice=34;
        //cout<<"the value is "<<m1.rice<<endl;
    int  main(){
        enum Meal{ breakfast,  lunch, dinner };
        //we can also write it as Meal m1 = breakfast;
        cout<<breakfast;//with the help of enum we can give the number to breakfast,lunch,dinner due to this our program is make more readable
        cout<<lunch;
        cout<<dinner;
    
    return 0;
}