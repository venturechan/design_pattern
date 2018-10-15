package com.venture.oo;

/**
 * Created by Venture on 2018/10/15.
 */
public class SubMethod implements Operation{

    @Override
    public double getResult(double firstNum, double lastNum) {
        return firstNum/lastNum;
    }
}
