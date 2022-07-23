#include <stdio.h>

int main() {
    char x[100];
    int z;
    fgets(x,100,stdin);
    z=strlen(x);
    for (int i=0;i<z;i++){
        if (isalnum(x[i]))
            printf("%c",x[i]);
        else if(x[i]==32)
            printf(" ");
    }
    return 0;
}