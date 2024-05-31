package br.com.maisshopp;

import java.time.DayOfWeek;

public class SwithExpressions {

    public static void main(String[] args){

        EnumWeekDay day = EnumWeekDay.WEDNESDAY;
        int numDayOfWeek = switch (day){
            case MONDAY:
            case FRIDAY:
            case SUNDAY:
                yield 1;
            case WEDNESDAY:
//                System.out.println(1);
                yield 2;
            default:
                throw new IllegalStateException("Invalid day: " + day);
        };

        System.out.println( STR."\{day} is the day number: \{numDayOfWeek} in the week");

    }


}
