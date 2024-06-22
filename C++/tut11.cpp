//about break and cantinue
#include<iostream>
using namespace std;

int main(){;
    //for(int i=0; i<40; i++)
    //{
        //cout<<i<<endl;
        //if(i==24){
            //break;
        //}
    //}

      for(int i=0; i<40; i++)
    {
        
        if(i==24){
            continue;//it will print every thing except 24
        }
       cout<<i<<endl; 
    }
    return 0;
}