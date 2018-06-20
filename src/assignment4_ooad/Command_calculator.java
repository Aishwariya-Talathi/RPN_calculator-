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
public class Command_calculator extends CommandInterface{
    private String _expression;
    private Calculator _calculator;

    public Command_calculator(Calculator calculator,  String expression){
        this._calculator = calculator;
        this._expression = expression;
    }

    public void Execute(){
        _calculator.Operation(_expression);
    }
   

    public void UnExecute(){
       
    }
}
