# Table of Contents
- [Table of Contents](#table-of-contents)
- [Calculator](#calculator)
- [What to solve?](#what-to-solve)
  - [Example outcome:](#example-outcome)
  - [Reverse Polish Notation](#reverse-polish-notation)
- [How to approach this problem?](#how-to-approach-this-problem)
- [Stack Implementation](#stack-implementation)

# Calculator
 - A java program that calculates a simple expression **string**. In this project, I learned how to code my own implementation of *Stack* and *Queue* as well as using the *Reverse Polish Notation*. I did not rely on any of the built-in methods from java.utils.

This is a fun and challenging project that helps me to further understand data structures.

---
#  What to solve?

 - Assumed that the expression string does not contains negative numbers. It should only contains  '+', '-', '*', '/' operators and open '(' and closing parenthesis ')'. Make sure that integer division should truncate towards *zero*. Additionally, assumed that the given expression is always valid. You may use any of the ADTs implementation to built this program.

 - You must not use any built-in function which evaluates string as mathematical expressions, such as eval(). You will have to fully implement the ADT. Lastly, You are not allowed to use any implementation from java.utils.*;

## Example outcome:
```
input: str = "1+1"
output: 2
```
```
input: str = "(2+6*3+5-(3*14/7+2)*5)+3"
output: -12
```
```
input str = "2*(5+5*2)/3+(6/2+8)"
output: 21
```
---
## Reverse Polish Notation
- A **Revers Polish Notation** or **PostFix Notation** is a mathematical notation in which operators follow their operands. For example of infix notation: 3+5 is represented as 3,5,+ in postfix notation. Another example, infix notation 2*(5+5*2)/3+(6/2+8) is represented as 2,5,5,2,*,+,*,3,/,6,2,/,8,+,+ in postfix notation.
- Check this article for more detailed explanation
  - [RPN](https://mathworld.wolfram.com/ReversePolishNotation.html)

# How to approach this problem?
    - [] Implement Stack
    - [] Implement Queue
    - [] Tokenize string input
    - [] implement Reverse Polish Notation

---
# Stack Implementation






<!-- Link here -->


