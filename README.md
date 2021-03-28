# GradeBook-and-Lottery

Q1. A teacher has five students who have taken four tests. The teacher uses the following grading scale to assign a letter grade to a student, based on average of hi8s or her four test scores:

Test Score Letter Grade

90-100 A

80-89 B

70-79 C

60-69 D

0-59 F

Write a class that uses a String array or an ArrayList object to hold five students names, an array of five characters to hold five students letter grades and five arrays of four doubles each to hold each students set of test scores. The class should have methods that return a specific students&#39; name, the average test score, and a letter grade based on the average.

Demonstrate the class in a program that allows the user to enter each students name and his or her four test scores. It should then display each students&#39;s average test score and letter grade.

_ **Exception Do not accept test scores less than zero or greater than 100.** _

Q2. ATM Transaction: Using ATM machine, a user can withdraw and deposit money and also can check balance or print transaction history. Different cases using switch case needs to be provided for different operations like withdraw, deposit and check balance. The user will choose from any one of the available options as input. You need to design an ATM class that will throw an appropriate user defined exception on each transaction.

For example:

1. If number of inter-bank transactions exceeds 3, throw
2. Insufficient balance exception
3. If a user entered wrong pin
4. If ATM is not able to dispense the cash in case sufficient amount is not available in ATM
5. If a user enters the amount which is not a multiple of 100, 500 or 2000
6. If a user pressed INVALID option
7. Invalid amount
8. Transaction time out, etc.

Q3. Lottery Application: Write a Lottery class that simulates a lottery. The class should have an array of five integers named lotteryNumbers. The constructor should use the Random class to generate random numbers in range 0 through 9 for each element in the array. The class should also have a method that accepts an array of five integers that represents a person&#39;s lottery pick. The method is to compare the corresponding elements in the two arrays and returns the number of digits that match. For example, the following shows the lotteryNumbers array and the user&#39;s array with sample numbers stored in each. There are two matching digits(elements 2 and 4).

lotteryNumbers array:

| 7|4|9|1|3 |
| --- |

Users&#39;s array

| 4|2|9|7|3 |
| --- |

In addition class should have a method that returns a copy of lotterynumbers array.

Demonstrate the class in a program that asks the user to enter five numbers. The program should display the number of digits that match the randomnly generated lottery numbers. If all of the digits match, display a message proclaiming the user a grand prize winner.