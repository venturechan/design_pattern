package com.venture.oo;

import com.sun.org.apache.regexp.internal.REUtil;

/**
 * Created by Venture on 2018/10/15.
 * 这里面才是用到了多态。 根据传进来的method,动态的选择创建具体的对象。
 */
public class MethodFactory {

    Operation createMethod(String method){
        switch (method){
            case "add":
                return new AddMethod();
            case "sub":
                return new SubMethod();
            case "mul":
                return new MultiMethod();
            case "div":
                return new DivideMethod();
                default:
                    return null;
        }

    }
}
