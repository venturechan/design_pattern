package com.venture.oo;

/**
 * Created by Venture on 2018/10/15.
 */
public class MultiOperation implements Operation {

    @Override
    public double getResult(double firstNum, double lastNum) {
        return firstNum*lastNum;
    }
}
