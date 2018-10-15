package com.venture.oo;

import java.util.Scanner;

/**
 * 请用Java实现一个计算器控制台程序，要求输入两个数和运算符号，得到结果
 *
 *
 */
public class CalcSum {

    //接收运算符号
    //接收参数

    //运算符号，你得多一层映射，才行。
    //假设输入的是英文好了。

    static double add(double a ,double b){
        return a+b;
    }

    static double sub(double a,double b){
        return a-b;
    }

    static double multi(double a,double b){
        return a*b;
    }

    //增加前置条件，判断分母是否为0
    static double divide(double a,double b){
        return a/b;
    }

     public static void main(String argc[]){

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入计算方法: 加法请输入add 减法请输入 sub 乘法请输入 mul ,除法请输入 div");
        String calcmethod =scanner.next();

        if("add".equalsIgnoreCase(calcmethod)||"sub".equalsIgnoreCase(calcmethod)||"mul".equalsIgnoreCase(calcmethod)||"div".equalsIgnoreCase(calcmethod)){
            System.out.println("正在进行的是"+calcmethod+ ";请分别输入除数和被除数");
        }else{
            System.out.println("ERROR： 请输入正确的计算方式，您刚才输入的是："+calcmethod);
        }
        String divideStr = scanner.next();
        String dividendStr =scanner.next();
        double dividend = Double.valueOf(dividendStr);
        double divide = Double.valueOf(divideStr);

        switch (calcmethod){
            case "add":
                System.out.println("您的add计算结果为："+CalcSum.add(divide,dividend));
                break;
            case "sub":
                System.out.println("您的sub计算结果为："+CalcSum.sub(divide,dividend));
                break;
            case "div":
                System.out.println("您的div计算结果为："+CalcSum.divide(divide,dividend));
                break;
            case "mul":
                System.out.println("您的mul计算结果为："+CalcSum.multi(divide,dividend));
        }
         }
}
