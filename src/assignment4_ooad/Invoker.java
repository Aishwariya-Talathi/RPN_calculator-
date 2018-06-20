/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4_ooad;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

/**
 *
 * @author aishwariyatalathi
 */
public class Invoker {

    int j = 0;
    Stack<String> stack2 = new Stack<>();
    private Calculator _calculator = new Calculator();

    public void Compute(String Expression) {
        String s = Expression;
        CommandInterface command = new Command_calculator(_calculator, Expression);
        command.Execute();
    }


    public void undo() {

    }

    public void redo() {

    }
}
