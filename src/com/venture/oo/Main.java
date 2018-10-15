package com.venture.oo;

import java.util.Scanner;

/**
 * 请用Java实现一个计算器控制台程序，要求输入两个数和运算符号，得到结果
 *
 * 面向对象的优势很明显，这个CalcSum对象可以复用。
 *
 */
public class Main {

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
        double lastNum = Double.valueOf(dividendStr);
        double firstNum = Double.valueOf(divideStr);

        OperationFactory operationFactory = new OperationFactory();
         Operation op = operationFactory.createMethod(calcmethod);
         double result =op.getResult(firstNum,lastNum);
         System.out.println(result);



     }


}
