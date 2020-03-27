package com.test;


public class Test1 {


    public static void main(String[] args) {
        Test1 test = new Test1();
        Month myMonthValue = Month.Febraury;   //your input
        Week myWeeValue = Week.Monday;

        test.myMethod(myMonthValue,myWeeValue);
    }

    private void myMethod(Month myMonthValue, Week myWeeValue) {
        if(1==1 && myMonthValue!=Month.January && myWeeValue==Week.Monday){
            System.out.println("I am good");
        }



    }
}
