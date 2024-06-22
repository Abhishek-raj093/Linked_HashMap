#include<stdio.h>
 
 struct myArray
 {
    int total_size;
    int used_size;
    int *ptr;
 };

 void createArray(struct myArray*a, int tsize){
    (*a).total_size = tsize
 }

 int main(){
    struct myArray marks;

    return 0;
 }