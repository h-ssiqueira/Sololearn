str=input().upper()
i=0
c=0
x=65
for i in range(26):
    z=str.count(chr(x))
    if z<2:
       c+=1
    x+=1
if c==26:
    print("Unique")
else: print("Deja Vu")