x=input()
g=None
risk=None
l=len(x)
for i in range(l):
    if risk==True:
        if x[i]=='G':
            g=True
        elif x[i]=='$' or x[i]=='T':
            break
    elif x[i]=='$' or x[i]=='T':
        risk =True
if g==True:
    print("quiet")
else:
    print("ALARM")