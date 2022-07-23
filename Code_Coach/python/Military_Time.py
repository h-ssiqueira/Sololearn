x=input()

if x[-2]=='A':
    if x[1]=='2':
        print(x[:-3].replace(x[:2],'00'))
    else:
        if x[1]==':':
            print('0'+x[:-3])
        else:
            print(x[:-3])
else:
    if x[1]==':':
        a=int(x[0])
        a+=12
        print(str(a)+x[1:-3])
    else:
        if x[1]=='2':
            print(x[:-3])
        else:
            a=int(x[:2])
            a+=12
            print(x[:-3].replace(x[:2],str(a)))