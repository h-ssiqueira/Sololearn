#include <stdio.h>

int main() {
    int p=0,d=0;
    scanf("%d",&p);
    scanf("%d",&d);
    d*=50;
    p>d ? printf("Dollars"):printf("Pesos");
    return 0;
}