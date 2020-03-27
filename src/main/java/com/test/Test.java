package com.test;


public class Test {

    Month month;
    Week week;

    public Test(Month month, Week week){
        System.out.println("I am in the no-ards constuctor");
        this.month=month;
        this.week=week;
    }

    public static void main(String[] args) {
        String myMonth  = "January";
        String myWeek = "Monday";
        Test test = new Test(Month.valueOf(myMonth), Week.valueOf(myWeek));
        test. myMethod();
    }

    private void myMethod() {
        switch (month){
            case January:
                System.out.println("I am doing good ");
                switch (week){
                    case Monday: {
                        System.out.println("I am in the monday");
                        break;
                    }
                    case Tuesday:{
                        System.out.println("I am in the Tuesday");
                        break;
                    }
                    case Wednesday:{
                        System.out.println("I am in the wednesay");
                        break;
                    }
                }
                break;
            case Febraury:
                System.out.println("I am not doing good");
                break;
        }

    }
}
