file = open("/usercode/files/books.txt", "r")

#your code goes here
for i in file:
    print(i[0])
    if i[len(i)-1] =='\n':
        print(len(i)-1)
    else:
        print(len(i))

file.close()