#include <stdio.h>
#include <math.h>
int main() {
    int houses;
    float x;
    scanf("%d", &houses);

    //your code goes here
    x = (2.0/houses)*100;
    houses = ceil(2/houses*100);
    printf("%.0f",houses,ceil(x));
    return 0;
}