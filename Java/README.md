# Java
* [Time Converter](Java/Time_Converter.java)

You need a program to convert days to seconds.

The given code takes the amount of days as input. Complete the code to convert it to seconds and output the result.

**Sample Input**:

12

**Sample Output**:

1036800
* [Loan Calculator](Java/Loan_Calculator.java)

You take a loan from a friend and need to calculate how much you will owe him after 3 months.

You are going to pay him back 10% of the remaining loan amount each month.

Create a program that takes the loan amount as input, calculates and outputs the remaining amount after 3 months.

**Sample Input**:

20000

**Sample Output**:

10628

Here is the monthly payment schedule:

**Month 1**

Payment: 10% of 20000 = 2000

Remaining amount: 18000

**Month 2**

Payment: 10% of 18000 = 1800

Remaining amount: 16200

**Month 3:**

Payment: 10% of 16200 = 1620

Remaining amount: **14580**

* [Reverse String](Java/Reverse_a_String.java)

Write a program to take a string as input and output its reverse.

The given code takes a string as input and converts it into a **char** array, which contains letters of the string as its elements.

**Sample Input**:

hello there

**Sample Output**:

ereht olleh

* [Binary Converter](Java/Binary_Converter.java)

The binary numeric system uses only two digits: 0 and 1. Computers operate in binary, meaning they store data and perform calculations using only zeros and ones.

You need to make a program to convert integer numbers to their binary representation.

Create a **Converter** class with a static **toBinary()** method, which returns the binary version of its argument.

The code in main takes a number as input and calls the corresponding static method. Make sure the code works as expected.

**Sample Input**:

42

**Sample Output**:

101010

You can use the following code to convert a number to binary:
```java
String binary="";
while(num > 0) {
   binary = (num%2)+binary;
   num /= 2;
}
```

* [Shapes](Java/Shapes.java)

You are working on a graphical app, which includes multiple different shapes.

The given code declares a base **Shape** class with an abstract **area**() method and a **width** attribute.

You need to create two **Shape** subclasses, **Square** and **Circle**, which initialize the width attribute using their constructor, and define their **area**() methods.

The **area**() for the **Square** class should output the area of the square (the square of the width), while for the **Circle**, it should output the area of the given circle (PI\*width\*width).

The code in main creates two objects with the given user input and calls the area() methods.

**Sample Input**:

5

2

**Sample Output**:

25

12.566370614359172

* [Bowling Game](Java/Bowling_Game.java)

You are creating a bowling game!

The given code declares a **Bowling** class with its <u>constructor</u> and **addPlayer**() <u>method</u>.

Each player of the game has a name and points, and are stored in the players <u>**HashMap**</u>.

The code in main takes 3 players data as input and adds them to the game.

You need to add a **getWinner**() <u>method</u> to the class, which calculates and outputs the name of the player with the maximum points.

**Sample Input**:

Dave 42

Amy 103

Rob 64

**Sample output**:

Amy