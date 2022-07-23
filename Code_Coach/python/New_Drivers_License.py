x=input()
y=int(input())
z=input()

alf=[chr(i+97).upper() for i in range(26)]

x=x[:1]
z2=[]
z=z.split(' ')
for i in z:
    z2.append(i[:1])

z2+=[x]

z3=z2.copy()

z3.sort()

group_num=0
ind=z3.index(x)+1
if ind/y>ind//y:
    group_num=int(ind//y+1)
else:
    group_num=int(ind/y)

print(int(group_num*20))