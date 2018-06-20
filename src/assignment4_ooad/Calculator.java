/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4_ooad;

import java.util.Stack;

/**
 *
 * @author aishwariyatalathi
 */
public class Calculator {
    static Stack<Double> stack1 = new Stack<>();
    public void Operation(String Expr) {
        Double var1,var2;
        for (String current_val:Expr.split("\\s+")) {
            switch (current_val) {
                case "+":
                    var1 = stack1.pop();
                    var2 = stack1.pop();
                    stack1.push(var1 + var2);
                    break;
                case "-":
                    var1 = stack1.pop();
                    var2 = stack1.pop();
                    stack1.push(var2 - var1);
                    break;
                case "*":
                    var1 = stack1.pop();
                    var2 = stack1.pop();
                    stack1.push(var1 * var2);
                    break;
                case "/":
                    var1 = stack1.pop();
                    var2 = stack1.pop();
                    stack1.push(var1 / var2);
                    break;
                case "^":
                    var1 = stack1.pop();
                    var2 = stack1.pop();
                    double ans = Math.pow(var1, var2);
                    stack1.push(ans);
                    break;
                default:
                    Double double_val = Double.parseDouble(current_val);
                    stack1.push(double_val);
                    break;
            }
        }
        System.out.println(stack1.pop());
    }
}
