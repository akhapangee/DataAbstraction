package com.akhilesh.main;

import com.akhilesh.math.AddCommand;
import com.akhilesh.math.MathContext;

/**
 *
 * @author Akhilesh
 */
public class MediatorPattern {

    public static void main(String[] args) {
        //injecting addCommand object
        //MathContext acting as mediator
        MathContext mathContext = new MathContext(new AddCommand());
        System.out.println(mathContext.doCalculate(15, 5));
    }
}
