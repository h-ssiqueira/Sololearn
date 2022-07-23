p=input()
l=len(p)

if l<7:
    print("Weak")
else:
    a=sum(i.isalpha() for i in p)
    x=l-a
    if x<4:
        print("Weak")
    else:
        print("Strong")