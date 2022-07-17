x <- read.csv('/usercode/files/titanic.csv')

x <- x[x$Age >=18,]
#print(x)
print(tapply(x$Pclass,x$Survived,mean))