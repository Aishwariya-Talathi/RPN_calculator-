# RPN_calculator-
Implementation of a RPN calculator using the Command design pattern that supports operations +, -, *, /, and ^ exponentiation.

RPN is Reverse Polish Notation, a parenthesis-less way of representing arithmetic expressions. 
5 +4 in infix is 5 4 + in RPN. 
The order of operations is determined by the placement of the operands and operators. 
Thus 3*4 + 5*6 in infix is 3 4 * 5 6 * +.

Reads expressions at the command prompt of the program. Output is a single integer.

After completion of the evaluation, the user can “undo” and “redo” each operation one by one, producing and intermediate expression. 
Undo is supported all the way back to the original expression. 
Redo is supported all the way to the end of the expression. 
The stacks contents are shown for each undo operation. 
Undo is activated using the “u” key. 
Redo is activated by pressing the ‘r’ key. 
“d” clears the stacks and restarts input. 
“x” terminates the program.

Example:

2 3 4 5 + + - <enter>
10
u
2 12 –
u
2 3 9 + -
r
2 12 -
r
10
d
