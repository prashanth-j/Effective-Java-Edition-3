package org.java8.effectiveJava.functionalProgramming;

public enum DaysOfTheWeek {

    MONDAY(10),
    TUESDAY(20),
    WEDNESDAY(30),
    THRUSDAY(40),
    FRIDAY(50),
    SATURDAY(60),
    SUNDAY(70);
    int valueOfYourDay;

    DaysOfTheWeek(int valueOfYourDay) {
        this.valueOfYourDay = valueOfYourDay;
    }
}
