#include<stdio.h>//if a number is greater tnan 9 & less than 100 than print true(1) 

int main()
{
    int x;
    printf("enter a number");
    scanf("%d", &x);
    printf("%d \n", x>9 && x<100);
    return 0;
}