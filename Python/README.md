## Python
* [Exponentiation](Python/Exponentiation.py)

**Exponentiation** is the raising of one number to the power of another.

This operation is performed using **two asterisks** **.

Let's use exponentiation to solve a known problem.

You are offered a choice of either $1.000.000 or $0.01 (one penny) doubled every day for 30 days (the resulting amount is doubled every day).

**Task**:

Write a program to calculate the amount that will result from the doubling to understand which choice results in a larger amount.

**Hint**:

Let's see how exponentiation can be useful to perform the calculation.

For example, if we want to calculate how much money we will have on the 5th day, we can use this expression: 0.01*(2**5) = 0.32 dollars (multiply the penny by 2 raised to the power of 5).

* [Simple Calculator](Python/Simple_Calculator.py)

Write a program to take two integers as input and output their sum.

**Sample Input**:

2

8

**Sample Output**:

10

* [FizzBuzz](Python/FizzBuzz.py)

**FizzBuzz** is a well known programming assignment, asked during interviews.

The given code solves the FizzBuzz problem and uses the words "Solo" and "Learn" instead of "Fizz" and "Buzz".

It takes an input **n** and outputs the numbers from **1** to **n**.

For each multiple of 3, print "**Solo**" instead of the number.

For each multiple of 5, prints "**Learn**" instead of the number.

For numbers which are multiples of both 3 and 5, output "**SoloLearn**".

You need to change the code to skip the even numbers, so that the logic only applies to odd numbers in the range.

* [Celsius to Fahrenheit Converter](Python/Celsius_to_Fahrenheit_Converter.py)

You are making a Celsius to Fahrenheit converter.
Write a function to take the Celsius value as an argument and return the corresponding Fahrenheit value.

**Sample Input**

36

**Sample Output**

96.8

* [Book Titles](Python/Book_Titles.py)

You have been asked to make a special book categorization program, which assigns each book a special code based on its title.

The code is equal to the first letter of the book, followed by the number of characters in the title.

For example, for the book "Harry Potter", the code would be: **H12**, as it contains 12 characters (including the space).

You are provided a **books.txt** file, which includes the book titles, each one written on a separate line.

Read the title one by one and output the code for each book on a separate line.

For example, if the books.txt file contains:

Some book

Another book

Your program should output:

S9

A12

* [Longest Word](Python/Longest_Word.py)

Given a text as input, find and output the longest word.

**Sample Input**

this is an awesome text

**Sample Output**

awesome

* [Fibonacci](Python/Fibonacci.py)

The Fibonacci sequence is one of the most famous formulas in mathematics.

Each number in the sequence is the **sum of the two numbers that precede it**.

For example, here is the Fibonacci sequence for 10 numbers, starting from 0: 0,1,1,2,3,5,8,13,21,34.

Write a program to take N (variable num in code template) positive numbers as input, and recursively calculate and output the first N numbers of the Fibonacci sequence (starting from 0).

**Sample Input**

6

**Sample Output**

0

1

1

2

3

5

* [Juice Maker](Python/Juice_Maker.py)

You are given a **Juice** class, which has **name** and **capacity** properties.

You need to complete the code to enable and adding of two **Juice** objects, resulting in a new **Juice** object with the combined capacity and names of the two juices being added.

For example, if you add an Orange juice with 1.0 capacity and an Apple juice with 2.5 capacity, the resulting juice should have:

name: **Orange&Apple**

capacity: **3.5**

The names have been combined using an **&** symbol.

* [Phone Number Validator](Python/Phone_Number_Validator.py)

You are given a number input, and need to check if it is a valid phone number.

A valid phone number has exactly 8 digits and starts with **1**, **8** or **9**.

Output "Valid" if the number is valid and "Invalid", if it is not.

**Sample Input**

81239870

**Sample Output**

Valid

* [Adding Words](Python/Adding_Words.py)

You need to write a function that takes multiple words as its argument and returns a concatenated version of those words separated by dashes (-).

The function should be able to take a varying number of words as the argument.

**Sample Input**

this

is

great

**Sample Output**

this-is-great