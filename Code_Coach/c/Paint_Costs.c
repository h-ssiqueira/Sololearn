#include <stdio.h>
#include <math.h>
int main() {
    int x, s=0;
    scanf("%d",&x);
    s=round((40+(x*5))*1.1);
    printf("%d",s);
    return 0;
}