package com.venture.oo;

/**
 * Created by Venture on 2018/10/15.
 * 这里面才是用到了多态。 根据传进来的method,动态的选择创建具体的对象。
 */
public class OperationFactory {

    Operation createMethod(String method){
        switch (method){
            case "add":
                return new AddOperation();
            case "sub":
                return new SubOperation();
            case "mul":
                return new MultiOperation();
            case "div":
                return new DivideOperation();
                default:
                    return null;
        }

    }
}
