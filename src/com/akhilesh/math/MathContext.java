/*
 * Mediator design patter demo
 */
package com.akhilesh.math;

/**
 *
 * @author Akhilesh
 */
public class MathContext {

    private MathCommand mathCommand;

    public MathContext(MathCommand mathCommand) {
        this.mathCommand = mathCommand;
    }
    public double doCalculate(double x, double y){
       return mathCommand.calculate(x, y);
    }

}
