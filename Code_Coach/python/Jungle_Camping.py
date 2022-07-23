x=input()
l=len(x)
if x[0]=='G':
    print("Lion",end=' ')
elif x[0]=='C':
    print("Bird",end=' ')
elif x[0]=='S':
    print("Snake",end=' ')
elif x[0]=='R':
    print("Tiger",end=' ')
for i in range(l):
    if x[i]==' ':
        i+=1
        if x[i]=='G':
            print("Lion",end=' ')
        elif x[i]=='C':
            print("Bird",end=' ')
        elif x[i]=='S':
            print("Snake",end=' ')
        elif x[i]=='R':
            print("Tiger",end=' ')