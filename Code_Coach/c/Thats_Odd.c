#include <stdio.h>

int main(){
    int t, s = 0, n;
    scanf("%d", &t);
    for (; t != 0; t--){
        scanf("%d", &n);
        if (n % 2 == 0)
            s += n;
    }
    printf("%d", s);
    return 0;
}