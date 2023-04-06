package ru.itgirl.firstspringproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    enum Week {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }

    @GetMapping("/dayOfWeek")
    public void dayOfWeek(@RequestParam(value = "name", defaultValue = "MONDAY") String dayOfWeek) {

        Week weekday = Week.MONDAY;

        switch(dayOfWeek) {
            case "MONDAY":
                weekday = Week.MONDAY;
                break;
            case "TUESDAY":
                weekday = Week.TUESDAY;
                break;
            case "WEDNESDAY":
                weekday = Week.WEDNESDAY;
                break;
            case "THURSDAY":
                weekday = Week.THURSDAY;
                break;
            case "FRIDAY":
                weekday = Week.FRIDAY;
                break;
            case "SATURDAY":
                weekday = Week.SATURDAY;
                break;
            case "SUNDAY":
                weekday = Week.SUNDAY;
                break;
        }

        switch(weekday) {
            case MONDAY:
                System.out.println("Cегодня понедельник");
                break;
            case TUESDAY:
                System.out.println("Cегодня вторник");
                break;
            case WEDNESDAY:
                System.out.println("Cегодня среда");
                break;
            case THURSDAY:
                System.out.println("Cегодня четверг");
            break;
            case FRIDAY:
                System.out.println("Cегодня пятница");
            break;
            case SATURDAY:
                System.out.println( "Cегодня суббота");
            break;
            case SUNDAY:
                System.out.println("Cегодня воскресенье");
            break;
            default:
                System.out.println(":(");
                break;
        }
    }

}
