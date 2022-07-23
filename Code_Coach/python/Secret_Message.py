x=input().lower()

let=['a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z']
l=len(x)
for i in range(l):
    if ord(x[i])!=32:
        a=let.index(x[i])
        b=-(a+1)
        print(let[b],end='')
    else:
        print(' ',end='')